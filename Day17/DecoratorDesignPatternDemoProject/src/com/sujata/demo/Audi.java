package com.sujata.demo;

public class Audi extends Car {

	
	public Audi(String model, String color) {
		super(model, color);
	}

	@Override
	public void engine() {
		System.out.println(getColor()+" Audi "+getModel()+" Engine Goes AOOOOOMMMMM......");

	}

}
