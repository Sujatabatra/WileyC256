package com.sujata.training;

public class Shape2DAnd3D extends Shape2D {

	public Shape2DAnd3D(Shape shape) {
		super(shape);
	}
	
	@Override
	public void calculate() {
		super.calculate();
		getShape().volume();
	}

}
