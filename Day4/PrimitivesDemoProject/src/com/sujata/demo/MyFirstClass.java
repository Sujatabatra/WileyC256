package com.sujata.demo;

public class MyFirstClass {

	public static void main(String[] args) {
		int x=10;  //decimal base
		System.out.println("x : "+x);
		
		int y=010;   //octal base
		System.out.println("y : "+y);
		
		int z=0x10;  //hexa base
		System.out.println("z : "+z);
		
		int a=0b10;  //binary base (jdk1.7)
		System.out.println("a : "+a);
		
		long b=10;
		
		byte var1=(byte)130;
		System.out.println("var1 : "+var1);
		
//		long var2=x;
//		long var2=10L;
		long var2=10l;
		
		int var3=(int)var2;
		
		double d1=7.5;
		
		float d2=(float)6.5;
		
		float d3=6.5f;
		

	}

}
