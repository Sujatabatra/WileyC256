package com.sujata.serializationcases;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MyEmployee implements Serializable {

	private static final long serialVersionUID = 1L;

	private int empId;
	private String empName;
	private String designation;
	transient private Address address;
	
	public MyEmployee() {
		
	}

	public MyEmployee(int empId, String empName, String designation, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	private void readObject(ObjectInputStream objectInputStream)throws IOException, ClassNotFoundException{
		objectInputStream.defaultReadObject();
		address=new Address((int)objectInputStream.readObject(),(String)objectInputStream.readObject(),(String)objectInputStream.readObject(),(String)objectInputStream.readObject(),(String)objectInputStream.readObject());
	}
	
	private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
		objectOutputStream.defaultWriteObject();
		objectOutputStream.writeObject(address.getHouseNo());
		objectOutputStream.writeObject(address.getStreet());
		objectOutputStream.writeObject(address.getCity());
		objectOutputStream.writeObject(address.getState());
		objectOutputStream.writeObject(address.getPinCode());
		
	}
}
