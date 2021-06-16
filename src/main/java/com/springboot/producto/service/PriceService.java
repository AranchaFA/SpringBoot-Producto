package com.springboot.producto.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.producto.model.dto.PriceResponseDTO;
import com.springboot.producto.model.entity.PriceEntity;
import com.springboot.producto.repository.IPriceRepository;

@Service
public class PriceService {
	/*
	 * ATTRIBUTES
	 */
	@Autowired
	IPriceRepository priceRepository;
	@Autowired
	ModelMapper modelMapper;

	// Date pattern could be in an independent class 'Util'
	public static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss");

	/*
	 * METHODS
	 */
	/**
	 * To retrieve a product price from 'PRICES' table. If none parameter is null,
	 * price to apply to specified product in specified date is returned. If
	 * dateString parameter is null or empty, price to apply to specified product at
	 * current system date is returned. In any other case, return null
	 * 
	 * @param productId
	 * @param brandId
	 * @param date
	 * @return Price of the product passed as parameter
	 * @throws ParseException Exception thrown if any error occurs parsing date
	 *                        parameter from String to Date object
	 */
	public PriceResponseDTO getProductPrice(String productId, String brandId, String dateString) throws ParseException {
		if ((productId != null && !productId.isEmpty()) && (brandId != null && !brandId.isEmpty())) {
			// If no date -> current system date
			Date date = dateString != null && !dateString.isEmpty() ? dateFormat.parse(dateString) : new Date();
			return this.entityToDto(
					this.priceRepository.getProductPrice(Integer.valueOf(productId), Integer.valueOf(brandId), date));
		}
		return null;
	}

	/**
	 * To map a PriceEntity object to PriceResponseDTO object
	 * 
	 * @param priceEntity
	 * @return Object from parameter cast to PriceResponseDTO
	 */
	private PriceResponseDTO entityToDto(PriceEntity priceEntity) {
		// Without checking if parameter is null, test methods throw an Exception
		return priceEntity != null ? modelMapper.map(priceEntity, PriceResponseDTO.class) : null;
	}

}
