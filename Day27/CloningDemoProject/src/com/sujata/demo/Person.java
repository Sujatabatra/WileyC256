package com.sujata.demo;

public class Person implements Cloneable {

	private int personId;
	private String personName;
	private int personAge;
	
	public Person() {
		
	}

	public Person(int personId, String personName, int personAge) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personAge = personAge;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAge=" + personAge + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
