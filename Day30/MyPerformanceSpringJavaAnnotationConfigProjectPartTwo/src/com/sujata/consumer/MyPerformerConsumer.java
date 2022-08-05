package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.configuration.PerformerConfiguration;
import com.sujata.producer.Performer;

public class MyPerformerConsumer {

	public static void main(String[] args) {
//		ApplicationContext springContainer=new ClassPathXmlApplicationContext("performer.xml");
		
		AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext(PerformerConfiguration.class);
		
		Performer performerOne=(Performer)springContainer.getBean("Vivek");
		performerOne.perform();
		
		Performer performerTwo=(Performer)springContainer.getBean("Chitranshu");
		performerTwo.perform();
		
		Performer performerThree=(Performer)springContainer.getBean("Krishna");
		performerThree.perform();

		Performer performerFour=(Performer)springContainer.getBean("Tejaswini");
		performerFour.perform();
	}

}
