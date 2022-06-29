package com.sujata.demo;

public class SecondClass {

	public void call() {
		//different class in same package
		FirstClass firstClass=new FirstClass();
		firstClass.methodOne();
		firstClass.methodTwo();
		
		MyFourthClass myFourthClass=new MyFourthClass();
		myFourthClass.dummy();
		
	}
}
