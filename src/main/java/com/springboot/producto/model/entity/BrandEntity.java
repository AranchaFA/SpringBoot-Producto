package com.springboot.producto.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BRANDS")
public class BrandEntity implements Serializable {

	/*
	 * ATTRIBUTES
	 */
	private static final long serialVersionUID = -5052104575549575823L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int brandId;
	@Column(nullable = false)
	private String brandName;
	@OneToMany(mappedBy = "brand", targetEntity = ProductEntity.class, cascade = CascadeType.ALL)
	private List<ProductEntity> listProducts = new ArrayList<ProductEntity>();

	/*
	 * METHODS
	 */
	// Getters + Setters
	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<ProductEntity> getListProducts() {
		return listProducts;
	}

	public void setListProducts(List<ProductEntity> listProducts) {
		this.listProducts = listProducts;
	}

}
