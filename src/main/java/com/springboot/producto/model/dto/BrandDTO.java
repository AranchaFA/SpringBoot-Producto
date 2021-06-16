package com.springboot.producto.model.dto;

import java.util.List;

public class BrandDTO {

	/*
	 * ATTRIBUTES
	 */
	private int brandId;
	private String brandName;
	private List<ProductDTO> listProductos;

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

	public List<ProductDTO> getListProductos() {
		return listProductos;
	}

	public void setListProductos(List<ProductDTO> listProductos) {
		this.listProductos = listProductos;
	}

}
