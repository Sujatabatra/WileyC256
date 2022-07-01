package com.sujata.demo;

public class CarRentalStore {

	public static void main(String[] args) {
		Audi car1=new Audi("A8", "Red");
		BMW car2=new BMW("Q5","Blue");
		Toyota car3=new Toyota("Altis", "Golden");
		
		Driver sonu=new Driver("Sonu");
		Driver ramesh=new Driver("Ramesh");

		sonu.setCar(car3);
		sonu.drive();
	}

}
