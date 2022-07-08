package com.sujata.demo;

public class MyFirstClass {

	public static void main(String[] args) {

//     Till JDK1.4		
//		Integer i1=Integer.valueOf(10);
//		Integer i2=Integer.valueOf(20);
//		
//		
//		int sum=i1.intValue()+i2.intValue();
//		Integer sumObject=Integer.valueOf(sum);
//		System.out.println(sum);

		
		//JDK 1.5 onwards
		Integer i=10;
		Integer j=10;
		Integer sum=i+j;
		System.out.println("Sum : "+sum);
	}

}
