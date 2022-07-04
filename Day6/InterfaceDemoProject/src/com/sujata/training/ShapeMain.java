package com.sujata.training;

public class ShapeMain {

	public static void main(String[] args) {
		Shape2D shape2D=new Shape2D(new Square());
		shape2D.calculate();

		Shape2DAnd3D shape2dAnd3D=new Shape2DAnd3D(new Cube());
		shape2dAnd3D.calculate();
	}

}
