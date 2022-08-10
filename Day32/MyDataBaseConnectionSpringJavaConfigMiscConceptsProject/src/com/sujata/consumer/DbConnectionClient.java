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
		applicationContext = new AnnotationConfigApplicationContext(ConnectionConfig.class);

		DbConnection dbConnection1 = (DbConnection) applicationContext.getBean("dbConnection");
//
		System.out.println(dbConnection1);
//
//		dbConnection1.dbConnect();
//
//		dbConnection1.dbDisconnect();
//
		DbConnection dbConnection2 = (DbConnection) applicationContext.getBean("dbConnection");
//
		System.out.println(dbConnection2);
//
//		dbConnection2.dbConnect();
//
//		dbConnection2.dbDisconnect();

	}

}
