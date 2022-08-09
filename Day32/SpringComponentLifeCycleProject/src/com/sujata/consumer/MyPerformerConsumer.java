package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.config.PerformerConfiguration;
import com.sujata.producer.Performer;

public class MyPerformerConsumer {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext(PerformerConfiguration.class);
		
		springContainer.registerShutdownHook();
		
		Performer performerTwo=(Performer)springContainer.getBean("Hamza");
		performerTwo.perform();
		
		

	}

}
