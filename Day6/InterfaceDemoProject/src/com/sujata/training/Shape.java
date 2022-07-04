package com.sujata.training;

public interface Shape {

	public void area();
	public void perimeter();
	default public void volume() {
		System.out.println("This Shape don't support volume");
	}
}
