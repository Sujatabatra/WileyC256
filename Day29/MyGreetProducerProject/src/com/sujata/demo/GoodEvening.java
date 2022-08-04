package com.sujata.demo;

public class GoodEvening implements Greet {

	@Override
	public void wish(String name) {
		System.out.println("Good Evening "+name+"!");

	}

}
