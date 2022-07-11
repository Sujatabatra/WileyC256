package com.sujata.generics;

class InputInteger{
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}

class InputString{
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}

class InputPerson{
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}

class GenericInput<T>{
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
}
public class FirstDemoClass {

	public static void main(String args[]) {
		GenericInput<Integer> obj1=new GenericInput<Integer>();
		
		obj1.setValue(10);
		System.out.println("obj1 : "+obj1.getValue());
		
		GenericInput<String> obj2=new GenericInput<String>();
		obj2.setValue("Sujata");
		System.out.println("obj2 : "+obj2.getValue());
		
		GenericInput<Person> obj3=new GenericInput<Person>();
		obj3.setValue(new Person(101,"AAA"));
		Person person=obj3.getValue();
		//implicit call goes to toString() method of Object class
		System.out.println("obj3 : "+person);
		
	}
}
