package com.springboot.producto.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.producto.model.dto.PriceResponseDTO;
import com.springboot.producto.service.PriceService;

@RestController
public class PriceController {

	/*
	 * ATTRIBUTES
	 */
	@Autowired
	PriceService priceService;

	/*
	 * METHODS
	 */
	/**
	 * If none parameter is null, price to apply to specified product is returned.
	 * If date parameter is null, price to apply to specified product at current
	 * system date is returned. In any other case, null is returned
	 * 
	 * @param productId
	 * @param brandId
	 * @param date
	 * @return Price of the object passed as parameter.
	 * @throws ParseException
	 */
	@RequestMapping(value = "/prices", method = RequestMethod.GET) // method=.GET by default, it could be omitted
	public PriceResponseDTO getPrices(@RequestParam(required = false) String productId,
			@RequestParam(required = false) String brandId, @RequestParam(required = false) String dateString)
			throws ParseException {

		return this.priceService.getProductPrice(productId, brandId, dateString);
	}

}
