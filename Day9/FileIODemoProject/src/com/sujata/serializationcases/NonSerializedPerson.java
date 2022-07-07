package com.sujata.serializationcases;

import java.io.Serializable;

public class NonSerializedPerson{

	private int personId;
	private String personName;
	
	public NonSerializedPerson() {
		
	}

	public NonSerializedPerson(int personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
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
	
	
}
