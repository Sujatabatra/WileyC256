package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class KitabTreeSetDemoClass {

	public static void main(String[] args) {
		/*
		 * HashSet is the Sorted Unique autogrowable and autoshrinkable collection of Objects
		 */
		Set<Kitab> dataCollection=new TreeSet<Kitab>(new SortKitabByPrice());
		
		System.out.println("Size of dataCollection : "+dataCollection.size());
		dataCollection.add(new Kitab(101, "Book1", "Author A", 750, 500));
		dataCollection.add(new Kitab(102, "Book2", "Author X", 1750, 1500));
		dataCollection.add(new Kitab(103, "Book3", "Author A", 890, 1000));
		dataCollection.add(new Kitab(104, "Book4", "Author Y", 2150, 800));
		dataCollection.add(new Kitab(101, "Book1", "Author A", 750, 500));
		dataCollection.add(new Kitab(105, "Book5", "Author Z", 1500, 4800));
		System.out.println("Size of dataCollection : "+dataCollection.size());
		System.out.println(dataCollection);
		
//		dataCollection.remove(10);
		System.out.println("Size of dataCollection : "+dataCollection.size());
		System.out.println("Iteration Using For Each");
		for(Kitab element:dataCollection) {
			System.out.println(element);
		}
		System.out.println("Iteration Using Iterator");
		//iterator() : factory method : Factory Design Pattern
		Iterator<Kitab> iterator=dataCollection.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
