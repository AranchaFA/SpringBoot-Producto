package com.springboot.producto.service;

import com.springboot.producto.service.PriceService;
import static org.assertj.core.api.Assertions.assertThat;

import java.text.ParseException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.producto.UtilTest;
import com.springboot.producto.model.dto.PriceResponseDTO;
import com.springboot.producto.model.entity.PriceEntity;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PriceServiceTest {

	/*
	 * Context for the tests
	 */
	@TestConfiguration
	static class PriceServiceTestContextConfiguration {
		@Bean
		public PriceService priceService() {
			return new PriceService();
		}

		@Bean
		public ModelMapper modelMapper() {
			return new ModelMapper();
		}
	}

	/*
	 * Service instance wired to test context
	 */
	@Autowired
	private PriceService priceService;

	/*
	 * TEST CASES Comparing only priceList attribute (which is the Id)
	 */
	@Test
	public void test1() throws ParseException {
		PriceResponseDTO expectedPrice = new PriceResponseDTO();
		expectedPrice.setPriceList(1);
		assertThat(this.priceService.getProductPrice(UtilTest.PRODUCT_ID, UtilTest.BRAND_ID, UtilTest.DATE_STRING_1)
				.getPriceList()).isEqualTo(expectedPrice.getPriceList());
	}

	@Test
	public void test2() throws ParseException {
		PriceEntity expectedPrice = new PriceEntity();
		expectedPrice.setPriceList(2);
		assertThat(this.priceService.getProductPrice(UtilTest.PRODUCT_ID, UtilTest.BRAND_ID, UtilTest.DATE_STRING_2)
				.getPriceList()).isEqualTo(expectedPrice.getPriceList());
	}

	@Test
	public void test3() throws ParseException {
		PriceEntity expectedPrice = new PriceEntity();
		expectedPrice.setPriceList(1);
		assertThat(this.priceService.getProductPrice(UtilTest.PRODUCT_ID, UtilTest.BRAND_ID, UtilTest.DATE_STRING_3)
				.getPriceList()).isEqualTo(expectedPrice.getPriceList());
	}

	@Test
	public void test4() throws ParseException {
		PriceEntity expectedPrice = new PriceEntity();
		expectedPrice.setPriceList(3);
		assertThat(this.priceService.getProductPrice(UtilTest.PRODUCT_ID, UtilTest.BRAND_ID, UtilTest.DATE_STRING_4)
				.getPriceList()).isEqualTo(expectedPrice.getPriceList());
	}

	@Test
	public void test5() throws ParseException {
		PriceEntity expectedPrice = new PriceEntity();
		expectedPrice.setPriceList(4);
		assertThat(this.priceService.getProductPrice(UtilTest.PRODUCT_ID, UtilTest.BRAND_ID, UtilTest.DATE_STRING_5)
				.getPriceList()).isEqualTo(expectedPrice.getPriceList());
	}

}
