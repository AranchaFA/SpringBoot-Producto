package com.springboot.producto.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springboot.producto.model.entity.PriceEntity;

public interface IPriceRepository extends CrudRepository<PriceEntity, Integer> {

	@Query(value = "select * from PRICES where PRODUCT_ID=:productId AND BRAND_ID=:brandId AND START_DATE<=:date AND END_DATE>:date"
			+ " AND PRIORITY=(select max(PRIORITY) from PRICES where PRODUCT_ID=:productId AND BRAND_ID=:brandId AND START_DATE<=:date AND END_DATE>:date)",
			nativeQuery = true)
	public PriceEntity getProductPrice(@Param("productId") int productId, @Param("brandId") int brandId,
			@Param("date") Date date);

}
