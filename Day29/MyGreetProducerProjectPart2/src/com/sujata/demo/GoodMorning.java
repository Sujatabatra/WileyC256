package com.sujata.demo;

public class GoodMorning implements Greet {

	private String name;
	
	
	public GoodMorning() {
		super();
	}


	public GoodMorning(String name) {
		super();
		this.name = name;
	}


	@Override
	public void wish() {
		System.out.println("Good Morning "+name+"!");

	}

}
