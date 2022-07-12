package com.sujata.demo;

class OuterClass{
	private int value1;
	public int getValue1() {
		return value1;
	}
	public void setValue1(int value1) {
		this.value1 = value1;
	}
	public void message() {
		System.out.println("Hi I am message() method from Outer Class");
	}
	
	class InnerClass{
	
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		public void show() {
			System.out.println("Name : "+name);
			System.out.println("value1 : "+value1);
			message();
		}
	}
	
	
	public void display() {
//		InnerClass obj=new InnerClass();
//		System.out.println("Name : "+obj.name);
//		System.out.println("Name : "+name);
		System.out.println("value1 : "+value1);
		message();
	}
}
public class FirstInnerClassDemo {

	public static void main(String args[]) {
		
		OuterClass outerClass=new OuterClass();
		
		OuterClass.InnerClass innerClass=outerClass.new InnerClass();
		outerClass.setValue1(10);
		
		innerClass.setName("AAAA");
		innerClass.show();
	}
}
