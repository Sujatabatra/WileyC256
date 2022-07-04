package com.sujata.demo;

class SecondStaticDemo{
	int x;
	private static int y;
	public void showValues() {
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public static int getY() {
		return y;
	}
	public static void setY(int y) {
		SecondStaticDemo.y = y;
	}
	
	public static void display() {
		System.out.println("y : "+y);
//		System.out.println("x : "+x);
		
	}
	
	
}
public class MySecondStaticClassDemo {

	public static void main(String[] args) {
		SecondStaticDemo.display();
		SecondStaticDemo.setY(10);
		
		SecondStaticDemo obj1=new SecondStaticDemo();
		obj1.x=20;
		
		SecondStaticDemo obj2=new SecondStaticDemo();
		obj2.x=45;
		obj2.setY(70);
		
		obj1.showValues();
		System.out.println("=============");
		obj2.showValues();
		
		System.out.println("y : "+SecondStaticDemo.getY());
		

	}

}
