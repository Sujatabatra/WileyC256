package com.sujata.client;

import java.util.Scanner;

import com.sujata.bean.Person;
import com.sujata.service.PersonService;

public class PersonMain {

	public static void main(String[] args) {
		PersonService personService=new PersonService();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter id of person : ");
		int id=scanner.nextInt();
		
		Person person=personService.attachSalutationModified(id);
		System.out.println(person);

	}

}
