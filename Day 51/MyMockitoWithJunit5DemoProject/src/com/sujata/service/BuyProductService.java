package com.sujata.service;

import java.util.List;

import com.sujata.bean.Stock;
import com.sujata.repository.ProductDao;

import lombok.Setter;

public class BuyProductService {

	@Setter
	private List<Stock> stocks;
	@Setter
	private ProductDao productDao;
	
	public double getTotalPrice() {
		double totalPrice=0;
		for(Stock stock:stocks) {
			totalPrice=totalPrice+(stock.getQuantity()*productDao.getPrice(stock));
		}
		return totalPrice;
	}
}
