package com.sujata.serializationcases;

public class Address {

	private int houseNo;
	private String Street;
	private String city;
	private String state;
	private String pinCode;
	
	public Address() {
		
	}

	public Address(int houseNo, String street, String city, String state, String pinCode) {
		super();
		this.houseNo = houseNo;
		Street = street;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	
}
