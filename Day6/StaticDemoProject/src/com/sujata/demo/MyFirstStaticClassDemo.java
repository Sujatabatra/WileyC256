package com.sujata.demo;

class FirstStaticDemo{
	int x;
	static int y;
	public void showValues() {
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
}
public class MyFirstStaticClassDemo {

	public static void main(String[] args) {
		FirstStaticDemo.y=10;
		
		FirstStaticDemo obj1=new FirstStaticDemo();
		obj1.x=20;
		
		FirstStaticDemo obj2=new FirstStaticDemo();
		obj2.x=45;
		obj2.y=70;
		
		obj1.showValues();
		System.out.println("=============");
		obj2.showValues();
		
		System.out.println("y : "+FirstStaticDemo.y);
		

	}

}
