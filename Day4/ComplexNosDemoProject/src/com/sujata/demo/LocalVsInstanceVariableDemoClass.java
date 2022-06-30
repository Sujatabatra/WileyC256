package com.sujata.demo;

public class LocalVsInstanceVariableDemoClass {

	private int value;
	private String name;
	
	public void show(int x) {
		String anotherName=null;
		System.out.println("value : "+value);
		System.out.println("name : "+name);
		System.out.println("anotherName : "+anotherName);
		System.out.println("x : "+x);
	}
}
