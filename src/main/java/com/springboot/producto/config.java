package com.springboot.producto;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
	// For mapping DTO<->Entity
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
}
