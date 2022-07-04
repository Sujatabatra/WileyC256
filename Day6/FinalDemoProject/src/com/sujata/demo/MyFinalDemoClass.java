package com.sujata.demo;

final class DemoBase{
	private final int value1=10;
	private int value2;
	
	public void setValues(int no1,int no2) {
		final int x=10;
		int y=no1;
		y=y+5;
		
//		x=x+10;
//		value1=no1;
		value2=no2;
	}
	
	public void displayValues() {
		System.out.println("Value1 : "+value1);
		System.out.println("Value2 : "+value2);
	}
	
	public void demo() {
		System.out.println("Hi I am demo method from Demo Base");
	}
	
	final public void dummy() {
		System.out.println("Hi I am demo method from Demo Base");
	}
}

class DemoDerived extends DemoBase{
	
	@Override
	public void demo() {
		System.out.println("Hi I am demo method from DemoDerived");
	}
//	@Override
//	public void dummy() {
//		System.out.println("Hi I am demo method from DemoDerived");
//	}
}
public class MyFinalDemoClass {

	public static void main(String[] args) {
		DemoBase demoBase=new DemoBase();
		demoBase.setValues(10, 20);
		demoBase.displayValues();
	}

}
