package com.sujata.deepcloning;

public class Person implements Cloneable {

	private int personId;
	private String personName;
	private int personAge;
	private Address personAddress;
	
	public Person() {
		
	}

	public Person(int personId, String personName, int personAge) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personAge = personAge;
	}

	
	public Person(int personId, String personName, int personAge, Address personAddress) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personAge = personAge;
		this.personAddress = personAddress;
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

	
	public Address getPersonAddress() {
		return personAddress;
	}

	public void setPersonAddress(Address personAddress) {
		this.personAddress = personAddress;
	}

	
	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAge=" + personAge
				+ ", personAddress=" + personAddress + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Person person=(Person)super.clone();
		person.personAddress=(Address)personAddress.clone();
//		person.personAddress=new Address(person.getPersonAddress().getHouseNo(),person.getPersonAddress().getStreet(),person.getPersonAddress().getCity(),person.getPersonAddress().getState(),person.getPersonAddress().getPincode());
		return person;
	}
}
