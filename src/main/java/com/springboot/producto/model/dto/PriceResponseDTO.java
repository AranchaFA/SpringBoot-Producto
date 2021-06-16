package com.springboot.producto.model.dto;

import java.io.Serializable;
import java.util.Date;


/**
 * Data Transfer Object for manipulate data from 'PRICES' table
 * 
 * @author aranc
 *
 */
public class PriceResponseDTO implements Serializable{

	/*
	 * ATTRIBUTES
	 */
	private static final long serialVersionUID = 1L;
	
	private int priceList;
	private int brandId; // It would be better a DTOBrand
	private int productId; // It would be better a DTOProduct
	private Date startDate;
	private Date endDate;
	private float price;
	private String currency;

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

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getPriceList() {
		return priceList;
	}

	public void setPriceList(int priceList) {
		this.priceList = priceList;
	}


}
