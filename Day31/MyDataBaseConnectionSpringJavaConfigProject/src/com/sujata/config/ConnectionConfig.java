package com.sujata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.DbConnection;
import com.sujata.producer.OracleConnection;
import com.sujata.producer.SybaseConnection;

@Configuration
public class ConnectionConfig {

	@Bean
	public OracleConnection oracle() {
		return new OracleConnection("OracleUrl", "scott", "tiger");
		
	}
	
	@Bean(name = "sybase")
	public SybaseConnection getSybaseConnection() {
		SybaseConnection sybaseConnection=new SybaseConnection();
		
		sybaseConnection.setUrl("SybaseUrl");
		sybaseConnection.setUsername("user1");
		sybaseConnection.setPassword("password123");
		return sybaseConnection;
	}
	
	@Bean
	public DbConnection dbConnection() {
		DbConnection dbConnection=new DbConnection();
		dbConnection.setConnection(getSybaseConnection());
		return dbConnection;
	}
	
}
