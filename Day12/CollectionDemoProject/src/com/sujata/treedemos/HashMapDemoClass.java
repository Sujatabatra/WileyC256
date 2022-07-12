package com.sujata.treedemos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemoClass {

	public static void main(String[] args) {
		/*
		 * HashMap is the unordered collection of auto growable and autoshrinkable key value pairs,
		 * where key is unique and values can be duplicate,
		 * unordering as per key.
		 */
		Map<String, Integer> months=new HashMap<String, Integer>();
		
		months.put("Jan", 31);
		months.put("Feb", 28);
		months.put("Mar", 31);
		months.put("Apr", 30);
		months.put("May", 31);
		months.put("Jun", 30);
		
		System.out.println(months);
		
		months.put("Feb", 29);
		
		Set<String> monthNames= months.keySet();
		for(String monthName:monthNames) {
			System.out.println(monthName+" have "+months.get(monthName)+" days");
		}

	}

}
