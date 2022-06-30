package com.sujata.demo;

public class MySingletonMainClass {

	public static void main(String[] args) {
		MySingletonClass ob1=MySingletonClass.getInstance();
		
		MySingletonClass ob2=MySingletonClass.getInstance();

		System.out.println(ob1);
		System.out.println(ob2);
	}

}
