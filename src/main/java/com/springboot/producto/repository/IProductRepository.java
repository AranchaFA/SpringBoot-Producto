package com.springboot.producto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.producto.model.entity.ProductEntity;

public interface IProductRepository extends JpaRepository<ProductEntity, Integer> {

	// If we have any query for table 'PRODUCST' it should be here
}
