package com.sujata.listdemos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemoClass {

	public static void main(String[] args) {
		/*
		 * Vector is the Ordered duplicate 
		 * autogrowable and autoshrinkable collection of objects
		 */
		Vector<Integer> dataCollection=new Vector<Integer>();
//		Collection<Integer> dataCollection=new ArrayList<Integer>();
		System.out.println("Size of dataCollection : "+dataCollection.size());
		dataCollection.add(10);
		dataCollection.add(100);
		dataCollection.add(40);
		dataCollection.add(10);
		dataCollection.add(20);

		System.out.println("Size of dataCollection : "+dataCollection.size());
		System.out.println(dataCollection);
		
		System.out.println("Traversal Using Traditional For Loop");
		for(int index=0;index<dataCollection.size();index++) {
			System.out.println(dataCollection.get(index));
		}
		
		System.out.println("Traversal Using For Each Loop");
		for(Integer element:dataCollection) {
			System.out.println(element);
		}
		System.out.println("Traversal Using Iterator");
		Iterator<Integer> iterator=dataCollection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Reverse Traversal Using ListIterator");
		ListIterator<Integer> listIterator=dataCollection.listIterator();
		while(listIterator.hasNext())
			listIterator.next();
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		System.out.println("Traversal using Enumeration");
		Enumeration<Integer> enumeration=dataCollection.elements();
		while(enumeration.hasMoreElements())
			System.out.println(enumeration.nextElement());
		
	}

}
