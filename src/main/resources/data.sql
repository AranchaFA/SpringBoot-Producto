/* PRODUCTS TABLE */
insert into products (PRODUCT_ID,DESCRIPTION) values (35455,'NIKE AIR');

/* BRANDS TABLE */
insert into brands (BRAND_ID,BRAND_NAME) values (1,'NIKE');

/* PRICES TABLE */
insert into prices (BRAND_ID,PRODUCT_ID,START_DATE,END_DATE,PRIORITY,PRICE,CURRENCY) values (1,35455, parsedatetime('2020-06-14-00.00.00','yyyy-MM-dd-HH.mm.ss'),parsedatetime('2020-12-31-23.59.59','yyyy-MM-dd-HH.mm.ss'),0,35.50,'EUR');
insert into prices (BRAND_ID,PRODUCT_ID,START_DATE,END_DATE,PRIORITY,PRICE,CURRENCY) values (1,35455, parsedatetime('2020-06-14-15.00.00','yyyy-MM-dd-HH.mm.ss'),parsedatetime('2020-06-14-18.30.00','yyyy-MM-dd-HH.mm.ss'),1,25.45,'EUR');
insert into prices (BRAND_ID,PRODUCT_ID,START_DATE,END_DATE,PRIORITY,PRICE,CURRENCY) values (1,35455, parsedatetime('2020-06-15-00.00.00','yyyy-MM-dd-HH.mm.ss'),parsedatetime('2020-06-15-11.00.00','yyyy-MM-dd-HH.mm.ss'),1,30.50,'EUR');
insert into prices (BRAND_ID,PRODUCT_ID,START_DATE,END_DATE,PRIORITY,PRICE,CURRENCY) values (1,35455, parsedatetime('2020-06-15-16.00.00','yyyy-MM-dd-HH.mm.ss'),parsedatetime('2020-12-31-23.59.59','yyyy-MM-dd-HH.mm.ss'),1,38.95,'EUR');

