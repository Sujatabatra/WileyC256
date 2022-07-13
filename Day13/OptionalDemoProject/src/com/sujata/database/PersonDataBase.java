package com.sujata.database;

import java.util.HashMap;
import java.util.Map;

import com.sujata.bean.Person;

import lombok.Getter;
import lombok.Setter;

public class PersonDataBase {

	@Setter
	@Getter
	private static Map<Integer,Person> persons=new HashMap<Integer, Person>();
	
	static{
		persons.put(101, new Person(101, "AAAA", 34));
		persons.put(102, new Person(102, "BBBB", 49));
		persons.put(103, new Person(103, "CCCC", 73));
		persons.put(104, new Person(104, "DDDD", 28));
		persons.put(105, new Person(105, "EEEE", 65));
	}
	
	
}
