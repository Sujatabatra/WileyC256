package com.sujata.demo;

public class MainCoffeeClass {

	public static void main(String[] args) {
		Coffee coffee=Coffee.OVERWHELMING;
		
		System.out.println("Serving "+coffee.getQuantity()+" ounces of coffee in Rs."+coffee.getPrice());

	}

}
