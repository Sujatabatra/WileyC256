package com.sujata.demo;
/*
 * Rules for abstract class
 * 1. We can't instantiate(i.e create object) of an abstract class
 * 2. if a sinbfle method is marked as abstract, its mandatory to marks
 * class as abstract too.
 * 3. Child class must implement all the abstract class, otherwise
 * child class also needs to mark itself as abstract,
 * then we won't be able to instantiate child class too,
 * till the time all abstract methods are not implemented by further sub child classes
 */
abstract public class Car {

	private String model;
	private String color;
	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	
	abstract public void engine();
}
