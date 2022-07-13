package com.sujata.service;

import java.util.Map;
import java.util.Optional;

import com.sujata.bean.Person;
import com.sujata.database.PersonDataBase;

public class PersonService {

	public Person searchPersonByID(int id) {
		Map<Integer,Person> personList=PersonDataBase.getPersons();
		return personList.get(id);
	}
	
	public Person attachSalutation(int id) {
		Person person=searchPersonByID(id);
		if(person.getPersonAge()>=60)
			person.setPersonName("Sir/Mam "+person.getPersonName());
		return person;
	}
	
	public Optional<Person> searchPersonByIDModified(int id) {
		Map<Integer,Person> personList=PersonDataBase.getPersons();
		return Optional.ofNullable(personList.get(id));
	}
	
	public Person attachSalutationModified(int id) {
		Person person=searchPersonByIDModified(id).orElse(new Person(0,null,0));
		if(person.getPersonAge()>=60)
			person.setPersonName("Sir/Mam "+person.getPersonName());
		return person;
	}
}
