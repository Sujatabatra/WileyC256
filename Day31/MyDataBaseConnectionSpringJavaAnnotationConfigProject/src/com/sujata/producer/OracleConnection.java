package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("oracle")
public class OracleConnection implements Connection {

	private String url,username,password;
	
	
	public OracleConnection(@Value("OracleURL") String url,@Value("scott") String username, @Value("tiger") String password) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
	}

	@Override
	public void connect() {
		System.out.println("Connecting ORACLE with url : "+url+", username : "+username+", password : "+password);

	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting ORACLE!");

	}

}
