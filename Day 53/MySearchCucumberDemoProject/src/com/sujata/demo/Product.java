package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Product {

	private String productName;
	private int price;
	
	public Product() {
		
	}

	public Product(String productName, int price) {
		super();
		this.productName = productName;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public List<Product> getProductList(){
		List<Product> products=new ArrayList();
		products.add(new Product("Apple MacBook Pro", 100000));
		products.add(new Product("Apple MacAir", 150000));
		products.add(new Product("Apple iPhone 13 Pro", 110000));
		return products;
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, productName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return price == other.price && Objects.equals(productName, other.productName);
	}
	
	
}
