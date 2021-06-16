package com.springboot.producto.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.text.ParseException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.producto.UtilTest;
import com.springboot.producto.model.dto.PriceResponseDTO;
import com.springboot.producto.service.PriceService;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PriceControllerTest {

	/*
	 * Context for the tests
	 */
	@TestConfiguration
	static class PriceControllerTestContextConfiguration {
		@Bean
		public PriceService priceService() {
			return new PriceService();
		}
	}

	/*
	 * Controller instance wired to test context
	 */
	@Autowired
	private PriceService priceController;

	/*
	 * Mock of the Service on which Controller depends. To avoid errors from Service
	 * class affect test results on cascade. when(...) method allows 'emulate' the
	 * expected result of Service methods, it assure us a correct input for our
	 * test.
	 */
	@MockBean
	private PriceService priceService;

	/*
	 * TEST CASES Comparing only priceList (which is the Id) (There is no much
	 * interest in testing controller in this case, since the only function it has
	 * is directly return the result of the service method execution, so controller
	 * and service mock will always return the same. But this would be the structure
	 * to test our controller :) )
	 */

	@Test
	public void test1() throws ParseException {
		PriceResponseDTO expectedPrice = new PriceResponseDTO();
		expectedPrice.setPriceList(1);
		// Expected result from Service (we make sure that it doesn't return an
		// incorrect input for our test)
		when(this.priceService.getProductPrice(UtilTest.PRODUCT_ID, UtilTest.BRAND_ID, UtilTest.DATE_STRING_1))
				.thenReturn(expectedPrice);
		assertThat(this.priceController.getProductPrice(UtilTest.PRODUCT_ID, UtilTest.BRAND_ID, UtilTest.DATE_STRING_1)
				.getPriceList()).isEqualTo(expectedPrice.getPriceList());
	}

	@Test
	public void test2() throws ParseException {
		PriceResponseDTO expectedPrice = new PriceResponseDTO();
		expectedPrice.setPriceList(2);
		when(this.priceService.getProductPrice(UtilTest.PRODUCT_ID, UtilTest.BRAND_ID, UtilTest.DATE_STRING_2))
				.thenReturn(expectedPrice);
		assertThat(this.priceController.getProductPrice(UtilTest.PRODUCT_ID, UtilTest.BRAND_ID, UtilTest.DATE_STRING_2)
				.getPriceList()).isEqualTo(expectedPrice.getPriceList());
	}

	@Test
	public void test3() throws ParseException {
		PriceResponseDTO expectedPrice = new PriceResponseDTO();
		expectedPrice.setPriceList(1);
		when(this.priceService.getProductPrice(UtilTest.PRODUCT_ID, UtilTest.BRAND_ID, UtilTest.DATE_STRING_3))
				.thenReturn(expectedPrice);
		assertThat(this.priceController.getProductPrice(UtilTest.PRODUCT_ID, UtilTest.BRAND_ID, UtilTest.DATE_STRING_3)
				.getPriceList()).isEqualTo(expectedPrice.getPriceList());
	}

	@Test
	public void test4() throws ParseException {
		PriceResponseDTO expectedPrice = new PriceResponseDTO();
		expectedPrice.setPriceList(3);
		when(this.priceService.getProductPrice(UtilTest.PRODUCT_ID, UtilTest.BRAND_ID, UtilTest.DATE_STRING_4))
				.thenReturn(expectedPrice);
		assertThat(this.priceController.getProductPrice(UtilTest.PRODUCT_ID, UtilTest.BRAND_ID, UtilTest.DATE_STRING_4)
				.getPriceList()).isEqualTo(expectedPrice.getPriceList());
	}

	@Test
	public void test5() throws ParseException {
		PriceResponseDTO expectedPrice = new PriceResponseDTO();
		expectedPrice.setPriceList(4);
		when(this.priceService.getProductPrice(UtilTest.PRODUCT_ID, UtilTest.BRAND_ID, UtilTest.DATE_STRING_5))
				.thenReturn(expectedPrice);
		assertThat(this.priceController.getProductPrice(UtilTest.PRODUCT_ID, UtilTest.BRAND_ID, UtilTest.DATE_STRING_5)
				.getPriceList()).isEqualTo(expectedPrice.getPriceList());
	}
}
