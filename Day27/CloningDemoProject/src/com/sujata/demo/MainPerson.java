package com.sujata.demo;

import java.util.Scanner;

public class MainPerson {

	public static void main(String[] args) {
		Person originalObject = new Person();
		System.out.println(originalObject);

		originalObject.setPersonId(101);
		originalObject.setPersonName("AAAA");
		originalObject.setPersonAge(50);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Person Name : ");
		originalObject.setPersonName(scanner.next());

//		Person duplicateObject=new Person();
//		duplicateObject.setPersonId(originalObject.getPersonId());
//		duplicateObject.setPersonName(originalObject.getPersonName());
//		duplicateObject.setPersonAge(originalObject.getPersonAge());
		Person clonedObject=null;
		try {
			clonedObject = (Person) originalObject.clone();
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}
		
		System.out.println("Cloned Object : "+clonedObject);
		System.out.println("Original Object : "+originalObject);
		
		System.out.println("Enter new name for cloned object : ");
		clonedObject.setPersonName(scanner.next());
		
		System.out.println("Cloned Object : "+clonedObject);
		System.out.println("Original Object : "+originalObject);
		
	}

}
