package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Performer;

public class MyPerformerConsumer {

	public static void main(String[] args) {
//		ApplicationContext springContainer=new ClassPathXmlApplicationContext("performer.xml");
		AbstractApplicationContext springContainer=new ClassPathXmlApplicationContext("performer.xml");
		
		springContainer.registerShutdownHook();
		
		Performer performerTwo=(Performer)springContainer.getBean("Chitranshu");
		performerTwo.perform();
		
		
	}

}
