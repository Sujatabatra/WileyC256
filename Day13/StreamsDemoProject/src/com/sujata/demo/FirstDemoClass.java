package com.sujata.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FirstDemoClass {

	public static void main(String[] args) {
		List<Integer> collection=Arrays.asList(10,20,33,45,66,78,99);
		
		Stream<Integer> myStream=collection.stream();
		
		long total =myStream.count();
		System.out.println("Total No of Element : "+total);
		
//		collection.stream().forEach((element)->System.out.println(element));
		//java.lang.IllegalStateException: stream has already been operated upon or closed
		myStream.forEach(System.out::println);
		
		System.out.println("Total No. of Elements : "+collection.stream().count());
	}

}
