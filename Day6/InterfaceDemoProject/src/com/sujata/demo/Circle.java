package com.sujata.demo;

public class Circle implements RoundedShape {

	private int radius;
	private double area,circumference;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void area() {
		area=PI*radius*radius;

	}

	@Override
	public void display() {
		System.out.println("Area of Circle : "+area);
		System.out.println("Circumference of Circle : "+circumference);
	}

	@Override
	public void circumference() {
		circumference=2*PI*radius;

	}

}
