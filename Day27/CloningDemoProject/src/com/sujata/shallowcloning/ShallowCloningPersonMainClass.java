package com.sujata.shallowcloning;

public class ShallowCloningPersonMainClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Person originalPerson=new Person(101, "AAAA", 34, new Address(121, "My Street", "My City", "My State", "11111"));
		
		System.out.println("original Person: "+originalPerson);
		
		
		Person clonedObject=(Person) originalPerson.clone();
		
		System.out.println("original Person: "+originalPerson);
		System.out.println("Cloned Object : "+clonedObject);
		
		Address add=originalPerson.getPersonAddress();
		add.setHouseNo(232);
		originalPerson.setPersonAddress(add);
	
		System.out.println("original Person: "+originalPerson);
		System.out.println("Cloned Object : "+clonedObject);
		
		
		
	}

}
