package com.sujata.misc;

import com.sujata.generics.Person;

public class ObjectsEqualityDemoClass {

	public static void main(String[] args) {
		int i=10;
		int j=20;
		if(i==j)
			System.out.println("Both i and j are equal");
		else
			System.out.println("i and j are not equal");

		Person person1=new Person(101, "AAAA");
		Person person2=new Person(101, "AAAA");
		//incase of object == checks for wheather two reference variables refering to same object on heap or not
		if(person1==person2)
			System.out.println("Both person1 and person2 are equal");
		else
			System.out.println("person1 and person2 are not equal");
		
		Person person3=person1;
		if(person1==person3)
			System.out.println("Both person1 and person3 are equal");
		else
			System.out.println("person1 and person3 are not equal");
		
		if(person1.equals(person2))
			System.out.println("Both person1 and person2 are equal");
		else
			System.out.println("person1 and person2 are not equal");

		/*
		 * if two objects are meaningfully equal then their hashcodes also needs to be same, but
		 * if two objects hashcodes are same they might not be meaningfully equal
		 */
		System.out.println("person 1: "+person1.hashCode());
		System.out.println("person 2: "+person2.hashCode());
	}

}
