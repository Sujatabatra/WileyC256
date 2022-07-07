package com.sujata.serializationcases;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializedEmployee extends NonSerializedPerson implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private String department;
	private String designation;
	private double salary;
	
	public SerializedEmployee() {
		
	}
	public SerializedEmployee(int personId, String personName, String department, String designation, double salary) {
		super(personId, personName);
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
		objectInputStream.defaultReadObject();
		setPersonId((int)objectInputStream.readObject());
		setPersonName((String)objectInputStream.readObject());
	}
	
	private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
		objectOutputStream.defaultWriteObject();
		objectOutputStream.writeObject(getPersonId());
		objectOutputStream.writeObject(getPersonName());
		
		
	}
}
