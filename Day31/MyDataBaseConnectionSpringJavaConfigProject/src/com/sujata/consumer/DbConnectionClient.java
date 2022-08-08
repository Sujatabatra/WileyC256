package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.config.ConnectionConfig;
import com.sujata.producer.DbConnection;

public class DbConnectionClient {

	public static void main(String[] args) {
//		ApplicationContext applicationContext;
//		applicationContext=new ClassPathXmlApplicationContext("connection.xml");		
		
		AnnotationConfigApplicationContext applicationContext;
		applicationContext=new AnnotationConfigApplicationContext(ConnectionConfig.class);
		
		DbConnection dbConnection=(DbConnection)applicationContext.getBean("dbConnection");
		
		dbConnection.dbConnect();
		
		dbConnection.dbDisconnect();

	}

}
