package com.sujata.training;

import com.sujata.demo.FirstClass;

public class ThirdClass {

	public void callMethods() {
		//different class and different package
		com.sujata.demo.FirstClass firstClass=new com.sujata.demo.FirstClass();
		firstClass.methodOne();
		
//		MyDemoClass myDemoClass=new MyDemoClass();
		
//		com.sujata.demo.MyFourthClass
	}
}
