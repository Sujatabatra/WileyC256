package com.sujata.demo;

public class Square extends InputValue implements Shape, Result, NonRoundedShape {

	private int area, perimeter;
	
	public Square(int n){
		setValue(n);
	}
	@Override
	public void perimeter() {
		perimeter=4*getValue();

	}

	@Override
	public void display() {
		System.out.println("Area of square : "+area);
		System.out.println("Perimeter of square : "+perimeter);
	}

	@Override
	public void area() {
		area=getValue()*getValue();

	}

}
