package com.sujata.demo;

public class SearchProduct {

	public String getProduct(Product product) {
		if(product.getProductList().contains(product))
			return product.getProductName();
		return null;
	}
}
