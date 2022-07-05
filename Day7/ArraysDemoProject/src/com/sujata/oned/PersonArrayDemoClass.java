package com.sujata.oned;

import java.util.Scanner;

public class PersonArrayDemoClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		Person personList[];
		
		System.out.println("Enter Total No of Persons : ");
		int total=scanner.nextInt();
		
		personList=new Person[total];
		
		for(int index=0;index<total;index++) {
			personList[index]=new Person();
			System.out.println("Enter Person Id for index "+index+" : ");
			personList[index].setPersonId(scanner.nextInt());
			System.out.println("Enter Person Name for index "+index+" : ");
			personList[index].setPersonName(scanner.next());
			System.out.println("Enter Person Age for index "+index+" : ");
			personList[index].setPersonAge(scanner.nextInt());
		}
		
		for(Person person:personList) {
			System.out.println(person.getPersonId()+"   "+ person.getPersonName()+"   "+person.getPersonAge());
		}

	}

}
