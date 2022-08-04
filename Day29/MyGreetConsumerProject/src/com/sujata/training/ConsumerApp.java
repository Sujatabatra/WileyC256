package com.sujata.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.demo.GoodMorning;
import com.sujata.demo.Greet;

public class ConsumerApp {

	public static void main(String[] args) {
		 //Life Cycyle by developer 
		//Spring way is life cycle management by Spring Container
//		Greet greet=new GoodMorning();

		//Spring Container : object of ApplicationContext
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("greetConfigurationFile.xml");
		
		Greet greet=(Greet)applicationContext.getBean("eve");
		
		greet.wish("Hamza");
	}

}
