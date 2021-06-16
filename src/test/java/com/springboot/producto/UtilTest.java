package com.springboot.producto;

import java.text.DateFormat;

import com.springboot.producto.service.PriceService;

/**
 * Data for test1() to test5() in PriceControllerTest, PriceServiceTest and
 * PriceRepositoryTest.
 * 
 * @author aranc
 *
 */
public class UtilTest {

	/*
	 * Could it be better to define an independent DateFormat here?
	 */
	public static final String dateStringPattern = "yyyy-MM-dd-HH.mm.ss";
	/*
	 * Could it be an undesirable dependency? It allows 'bind' any change over date
	 * format in the Service with this test
	 */
	public static final DateFormat dateFormat = PriceService.dateFormat;//

	/*
	 * Data for the parameters
	 */
	public static final String DATE_STRING_1 = "2020-06-14-10.00.00";
	public static final String DATE_STRING_2 = "2020-06-14-16.00.00";
	public static final String DATE_STRING_3 = "2020-06-14-21.00.00";
	public static final String DATE_STRING_4 = "2020-06-15-10.00.00";
	public static final String DATE_STRING_5 = "2020-06-16-21.00.00";

	public static final String PRODUCT_ID = "35455";
	public static final String BRAND_ID = "1";

}
