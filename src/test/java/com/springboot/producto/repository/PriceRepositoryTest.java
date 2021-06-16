package com.springboot.producto.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.text.ParseException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.producto.UtilTest;
import com.springboot.producto.model.dto.PriceResponseDTO;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PriceRepositoryTest {

	/*
	 * IPriceRepository instance
	 */
	@Autowired
	private IPriceRepository iPriceRepository;

	/*
	 * TEST CASES Comparing only priceList (which is the Id)
	 */
	@Test
	public void test1() throws ParseException {
		PriceResponseDTO expectedPrice = new PriceResponseDTO();
		expectedPrice.setPriceList(1);
		assertThat(this.iPriceRepository.getProductPrice(35455, 1, UtilTest.dateFormat.parse(UtilTest.DATE_STRING_1))
				.getPriceList()).isEqualTo(expectedPrice.getPriceList());
	}

	@Test
	public void test2() throws ParseException {
		PriceResponseDTO expectedPrice = new PriceResponseDTO();
		expectedPrice.setPriceList(2);
		assertThat(this.iPriceRepository.getProductPrice(35455, 1, UtilTest.dateFormat.parse(UtilTest.DATE_STRING_2))
				.getPriceList()).isEqualTo(expectedPrice.getPriceList());
	}

	@Test
	public void test3() throws ParseException {
		PriceResponseDTO expectedPrice = new PriceResponseDTO();
		expectedPrice.setPriceList(1);
		assertThat(this.iPriceRepository.getProductPrice(35455, 1, UtilTest.dateFormat.parse(UtilTest.DATE_STRING_3))
				.getPriceList()).isEqualTo(expectedPrice.getPriceList());
	}

	@Test
	public void test4() throws ParseException {
		PriceResponseDTO expectedPrice = new PriceResponseDTO();
		expectedPrice.setPriceList(3);
		assertThat(this.iPriceRepository.getProductPrice(35455, 1, UtilTest.dateFormat.parse(UtilTest.DATE_STRING_4))
				.getPriceList()).isEqualTo(expectedPrice.getPriceList());
	}

	@Test
	public void test5() throws ParseException {
		PriceResponseDTO expectedPrice = new PriceResponseDTO();
		expectedPrice.setPriceList(4);
		assertThat(this.iPriceRepository.getProductPrice(35455, 1, UtilTest.dateFormat.parse(UtilTest.DATE_STRING_5))
				.getPriceList()).isEqualTo(expectedPrice.getPriceList());
	}
}
