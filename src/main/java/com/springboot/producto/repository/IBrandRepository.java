package com.springboot.producto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.producto.model.entity.BrandEntity;

public interface IBrandRepository extends JpaRepository<BrandEntity, Integer> {

	// If we have any query for table 'BRANDS' it should be here
}
