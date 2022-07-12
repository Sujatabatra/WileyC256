package com.sujata.demo;

class MyOuter{
	
	public void show() {
		int x=10;
		class MyInner{
			public void display() {
				System.out.println("Hi I am display Method from MyInner");
			}
		}
		
		MyInner obj=new MyInner();
		obj.display();
	}
	
	public void dummy() {
//		MyInner obj=new MyInner();
	}
}
public class MethodLocalInnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
