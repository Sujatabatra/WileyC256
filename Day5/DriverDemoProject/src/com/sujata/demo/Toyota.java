package com.sujata.demo;

public class Toyota extends Car {

	public Toyota(String model, String color) {
		super(model, color);
	}
	
	@Override
	public void engine() {
		System.out.println("Toyota Engine goes TOOOM!");
	}

}
