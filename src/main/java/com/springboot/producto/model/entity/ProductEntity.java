package com.springboot.producto.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
public class ProductEntity implements Serializable {

	/*
	 * ATTRIBUTES
	 */
	private static final long serialVersionUID = 8842988896514422041L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	private String description;
	@OneToMany(targetEntity = PriceEntity.class, mappedBy = "product", cascade = CascadeType.ALL)
	private List<PriceEntity> listPrices = new ArrayList<PriceEntity>();
	@ManyToOne(targetEntity = BrandEntity.class)
	@JoinColumn(name = "BRAND_ID")
	private BrandEntity brand;

	/*
	 * METHODS
	 */
	// Getters + Setters
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<PriceEntity> getListPrices() {
		return listPrices;
	}

	public void setListPrices(List<PriceEntity> listPrices) {
		this.listPrices = listPrices;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public BrandEntity getBrand() {
		return brand;
	}

	public void setBrand(BrandEntity brand) {
		this.brand = brand;
	}

}
