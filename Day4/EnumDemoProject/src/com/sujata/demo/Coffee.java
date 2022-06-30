package com.sujata.demo;

public enum Coffee {

	REGULAR(5,120.99),LARGE(7,135.99),OVERWHELMING(12,175.99);
	
	
	private Coffee(int quantity, double price) {
		this.quantity = quantity;
		this.price = price;
	}
	private int quantity;
	private double price;
	public int getQuantity() {
		return quantity;
	}
	public double getPrice() {
		return price;
	}
	
	
}
