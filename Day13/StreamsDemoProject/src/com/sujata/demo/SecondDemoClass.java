package com.sujata.demo;

import java.util.Arrays;
import java.util.List;

public class SecondDemoClass {

	public static void main(String[] args) {
		List<Integer> collection=Arrays.asList(10,20,33,45,66,78,20,10,99,33,45);
		
		System.out.println("Total no of Distinct Values : "+collection.stream()
				.distinct()   //intermediate
				.count());     //terminate
		
		collection.stream()
		.filter((element)->element%2==0)
		.forEach(System.out::println);
		
System.out.println("=========================");
		collection.stream()
		.filter((element)->element%2==0)
		.map((value)->value+5)
		.distinct()
		.forEach(System.out::println);
	}

}
