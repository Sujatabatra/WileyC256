package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.sujata.bean.Stock;
import com.sujata.repository.ProductDao;
import com.sujata.service.BuyProductService;

class TestBuyProductService {

	private BuyProductService buyProductService;
	private ProductDao productDao;

	@BeforeEach
	void setUp() throws Exception {
		buyProductService=new BuyProductService();
		
		productDao=Mockito.mock(ProductDao.class);
		
		List<Stock> stocks=new ArrayList<Stock>();
		stocks.add(new Stock(101, "Pencil", 10));
		stocks.add(new Stock(102, "Pen", 5));
		stocks.add(new Stock(103, "Eraser", 2));
		
		buyProductService.setStocks(stocks);
		buyProductService.setProductDao(productDao);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}

	@Test
	void testGetTotalPrice() {

		Mockito.when(productDao.getPrice(new Stock(101, "Pencil", 10))).thenReturn(10.0);
		Mockito.when(productDao.getPrice(new Stock(102, "Pen", 5))).thenReturn(100.0);
		Mockito.when(productDao.getPrice(new Stock(103, "Eraser", 2))).thenReturn(5.0);
		assertEquals(610, buyProductService.getTotalPrice());
	}

}
