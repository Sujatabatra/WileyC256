package com.sujata.demo;

public class CarRentalStore {

	public static void main(String[] args) {
		Audi audi=new Audi("A8", "Red");
		BMW bmw=new BMW("Q5","Blue");
		Toyota toyota=new Toyota("Altis", "Golden");
		
		Driver sonu=new Driver("Sonu");
		Driver ramesh=new Driver("Ramesh");

		sonu.setCar(bmw);
		sonu.drive();
	}

}
