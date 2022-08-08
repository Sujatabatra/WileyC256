package com.sujata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.DbConnection;
import com.sujata.producer.OracleConnection;
import com.sujata.producer.SybaseConnection;

@Configuration
@ComponentScan(basePackages = "com.sujata.producer")
public class ConnectionConfig {


	@Bean("oracle")
	public OracleConnection oracleConnection() {
		return new OracleConnection("OracleURL", "system", "sujata");
	}
	
	@Bean("OracleConnection")
	public DbConnection getDbConnection() {
		DbConnection dbConnection=new DbConnection();
		dbConnection.setConnection(oracleConnection());
		return dbConnection;
	}
	
}
