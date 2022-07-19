package com.sujata.demo;

public class CarMainClass {

	public static void main(String[] args) {
		Audi audi1=new Audi("A8", "Red");
		Audi audi2=new Audi("A6", "Silver");
		Audi audi3=new Audi("A4", "Blue");

		audi1.engine();
		audi2.engine();
		audi3.engine();
		
		SportsCar sportsCar1=new SportsCar(audi2);
		sportsCar1.nitroxEngine();
		
	}

}
