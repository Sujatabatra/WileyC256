package com.sujata.training;

//import all the static member of the StaticImportDemo class
import static com.sujata.demo.StaticImportDemo.*;

import com.sujata.demo.StaticImportDemo;

public class StaticImportDemoMain {

	public static void main(String[] args) {
//		StaticImportDemo.methodTwo();
		methodTwo();

//		com.sujata.demo.StaticImportDemo obj=new com.sujata.demo.StaticImportDemo();
		StaticImportDemo obj=new StaticImportDemo();
	}

}
