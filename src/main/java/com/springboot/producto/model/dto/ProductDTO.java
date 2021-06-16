package com.springboot.producto.model.dto;

import java.util.List;

public class ProductDTO {

	/*
	 * ATTRIBUTES
	 */
	private int poductId;
	private String description;
	private List<PriceResponseDTO> listPrices;
	private BrandDTO brand;

	/*
	 * METHODS
	 */
	// Getters + Setters
	public int getPoductId() {
		return poductId;
	}

	public void setPoductId(int poductId) {
		this.poductId = poductId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<PriceResponseDTO> getListPrices() {
		return listPrices;
	}

	public void setListPrices(List<PriceResponseDTO> listPrices) {
		this.listPrices = listPrices;
	}

	public BrandDTO getBrand() {
		return brand;
	}

	public void setBrand(BrandDTO brand) {
		this.brand = brand;
	}

}
