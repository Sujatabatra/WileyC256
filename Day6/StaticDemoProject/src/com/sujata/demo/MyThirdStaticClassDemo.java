package com.sujata.demo;

class Base{
	public void show() {
		System.out.println("Hi I am show method from Base");
	}
	
	public static void display() {
		System.out.println("Hi I am static display method from Base");
	}
}

class Derived extends Base{
	@Override
	public void show() {
		System.out.println("Hi I am show method from Derived");
	}
	
	public static void display() {
		System.out.println("Hi I am static display method from Derived");
	}
}
public class MyThirdStaticClassDemo {

	public static void main(String[] args) {
		Base.display();
		Derived.display();
		System.out.println("==============");
		Base b=new Base();
		b.show();
		b.display();
		System.out.println("==================");
		b=new Derived();
		b.show();
		b.display();
		
		
		

	}

}
