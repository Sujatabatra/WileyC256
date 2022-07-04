package com.sujata.training;

public class Shape2D {

	private Shape shape;

	public Shape2D(Shape shape) {
		super();
		this.shape = shape;
	}

	public void calculate() {
		shape.area();
		shape.perimeter();
	}

	public Shape getShape() {
		return shape;
	}
	
}
