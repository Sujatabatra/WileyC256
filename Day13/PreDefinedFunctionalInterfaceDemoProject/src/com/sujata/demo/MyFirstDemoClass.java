package com.sujata.demo;

import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;

@FunctionalInterface
interface First {
	void show();
//	void xyz();
}

@FunctionalInterface
interface Second {
	String getMessage();
}

@FunctionalInterface
interface Third{
	void greet(String name);
}

@FunctionalInterface
interface Fourth{
	int sum(int number1,int number2);
}

public class MyFirstDemoClass {

	public static void main(String[] args) {

//
//		First var1=new First() {
//			@Override
//			public void show() {
//				System.out.println("Hi I am show method");
//			}
//		};

//		First var1=()-> {
//				System.out.println("Hi I am show method from Lambda Expression");
//			};

		First var1 = () -> System.out.println("Hi I am show method from Lambda Expression");

		var1.show();

//		Second second=new Second() {
//			
//			@Override
//			public String getMessage() {
//				return "Welcome to Anonymous Inner class";
//			}
//		};

//		Second second = ()-> {
//				return "Welcome to Lambda Expressions";
//			};

		Supplier<String> second = () -> "Welcome to Lambda Expressions";
		

		System.out.println(second.get());
		
		
//		Third third=new Third() {
//			@Override
//			public void greet(String name) {
//				System.out.println("Welcome "+name);
//				
//			}
//		};
//		Third third=(name)-> System.out.println("Welcome "+name);
		Consumer<String> third=name-> System.out.println("Welcome "+name);
		third.accept("Manish");
		

//		Fourth fourth=new Fourth() {
//			@Override
//			public int sum(int number1, int number2) {
//				return number1+number2;
//			}
//		};
	
		IntBinaryOperator fourth=(number1,number2)-> number1+number2;
			
		System.out.println("Sum : "+fourth.applyAsInt(10, 20));
		
		
	}

}
