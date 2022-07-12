package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.sujata.generics.Person;

public class PersonHashSetDemoClass {

	public static void main(String[] args) {
		/*
		 * HashSet is the unordered Unique autogrowable and autoshrinkable collection of Objects
		 */
		Set<Person> dataCollection=new HashSet<Person>();
		
		System.out.println("Size of dataCollection : "+dataCollection.size());
		dataCollection.add(new Person(101, "AAAA"));
		dataCollection.add(new Person(102, "BBBB"));
		dataCollection.add(new Person(103, "CCCC"));
		dataCollection.add(new Person(101, "AAAA"));
		dataCollection.add(new Person(104, "DDDD"));
		dataCollection.add(new Person(102, "BBBB"));
		System.out.println("Size of dataCollection : "+dataCollection.size());
		System.out.println(dataCollection);
		
		dataCollection.remove(10);
		System.out.println("Size of dataCollection : "+dataCollection.size());
		System.out.println("Iteration Using For Each");
		for(Person element:dataCollection) {
			System.out.println(element);
		}
		System.out.println("Iteration Using Iterator");
		//iterator() : factory method : Factory Design Pattern
		Iterator<Person> iterator=dataCollection.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
