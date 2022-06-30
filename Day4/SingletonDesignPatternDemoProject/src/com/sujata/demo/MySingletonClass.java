package com.sujata.demo;

public class MySingletonClass {

	private static MySingletonClass instance=new MySingletonClass();
	
	private MySingletonClass() {
		
	}
	public void show() {
		System.out.println("Hi I am show method!");
	}
	
	public static MySingletonClass getInstance() {
		return instance;
	}
}
