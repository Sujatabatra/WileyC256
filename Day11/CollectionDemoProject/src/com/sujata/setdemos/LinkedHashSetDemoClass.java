package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemoClass {

	public static void main(String[] args) {
		/*
		 * HashSet is the Ordered Unique autogrowable and autoshrinkable collection of Objects
		 */
		Set<Integer> dataCollection=new LinkedHashSet<Integer>();
		
		System.out.println("Size of dataCollection : "+dataCollection.size());
		dataCollection.add(10);
		dataCollection.add(30);
		dataCollection.add(20);
		dataCollection.add(50);
		dataCollection.add(10);
		dataCollection.add(20);
		System.out.println("Size of dataCollection : "+dataCollection.size());
		System.out.println(dataCollection);
		
		dataCollection.remove(10);
		System.out.println("Size of dataCollection : "+dataCollection.size());
		System.out.println("Iteration Using For Each");
		for(Integer element:dataCollection) {
			System.out.println(element);
		}
		System.out.println("Iteration Using Iterator");
		//iterator() : factory method : Factory Design Pattern
		Iterator<Integer> iterator=dataCollection.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
