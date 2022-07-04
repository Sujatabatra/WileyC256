package com.sujata.demo;

//class MyString extends String{
//	
//}
public class MyStringClassDemo {
	final int value;
	
//	public MyStringClassDemo(int value) {
//		super();
//		this.value = value;
//	}
	public MyStringClassDemo() {
		value=10;
	}

	public final void  demo() {
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		final int num;
		
		String str1="Sujata";
		String str2="Batra";
		num=10;
//		num=5;
		String str3=str1.concat(str2);

		MyStringClassDemo obj=new MyStringClassDemo();
		obj.demo();
		obj.demo();
	}

}
