package com.sujata.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;

class DemoClass{
	public static void greet(String name) {
		System.out.println("Welcome "+name);
	}
}
public class FirstDemo {

	public static void main(String[] args) {
		
//		DoubleBinaryOperator obj=(number,power)->Math.pow(number, power);
		
		DoubleBinaryOperator obj=Math::pow;
		
		System.out.println("Power : "+obj.applyAsDouble(2, 5));
		
		Consumer<String> obj1=(name)->DemoClass.greet(name+" Bashir");
//		Consumer<String> obj1=DemoClass::greet;
		
		obj1.accept("Basit");

		List<String> lists=Arrays.asList("Sujata","Amrit","Aryan");
//		lists.sort(new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareTo(o2);
//			}
//		});
//		lists.sort((str1,str2)->str1.compareTo(str2));
		lists.sort(String::compareTo);
		
		System.out.println(lists);
		
//		Consumer<String> obj2=(str)->System.out.println(str);
		Consumer<String> obj2=System.out::println;
		obj2.accept("Sujata");
	}

}
