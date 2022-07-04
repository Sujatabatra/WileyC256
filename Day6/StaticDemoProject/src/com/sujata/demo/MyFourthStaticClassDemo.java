package com.sujata.demo;

class StaticBlockDemo{
	
	{
		System.out.println("Hi I am instance block from StaticBlockDemo!");
	}
	
	static {
		System.out.println("Hi I am static block from StaticBlockDemo");
	}
	
	public StaticBlockDemo() {
		System.out.println("Hi I am constructor from StaticBlockDemo");
	}
}

class StaticBlockDemoDerived extends StaticBlockDemo{
	{
		System.out.println("Hi I am instance block from StaticBlockDemoDerived");
	}
	
	static {
		System.out.println("Hi I am static block from StaticBlockDemoDerived");
	}
	
	public StaticBlockDemoDerived() {
		System.out.println("Hi I am constructor from StaticBlockDemoDerived");
	}
}
public class MyFourthStaticClassDemo {

	public static void main(String[] args) {
		//10,6,14
		StaticBlockDemo obj1=new StaticBlockDemo();
		
		System.out.println("=====================");
		//24,6,14,20,28
		StaticBlockDemoDerived obj=new StaticBlockDemoDerived();
		
		
		
		
		
		
		
	}

}
