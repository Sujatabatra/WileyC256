package com.sujata.training;

import com.sujata.demo.FirstClass;
//import com.sujata.demo.SecondClass;
public class ThirdClass {

	public void callMethods() {
		//different class and different package
//		com.sujata.demo.FirstClass firstClass=new com.sujata.demo.FirstClass();
		FirstClass firstClass=new FirstClass();
		firstClass.methodOne();
		
//		MyDemoClass myDemoClass=new MyDemoClass();
		
//		com.sujata.demo.MyFourthClass
		
		SecondClass secondClass=new SecondClass();
		secondClass.show();
		
		com.sujata.demo.SecondClass sOb=new com.sujata.demo.SecondClass();
		sOb.call();
	}
}
