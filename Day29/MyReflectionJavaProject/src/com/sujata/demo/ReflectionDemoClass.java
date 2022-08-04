package com.sujata.demo;

public class ReflectionDemoClass {

	private String str;
	
	public ReflectionDemoClass() {
		str="Sujata Batra";
	}
	
	public void show() {
		System.out.println(" str : "+str);
	}
	
	public void display(int number) {
		System.out.println("Hi I am display method from ReflectionDemoClass , number : "+number);
	}
	
	private void methodOne() {
		System.out.println("Hi I am private method methodOne");
	}
}
