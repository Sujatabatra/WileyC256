package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sybase")
public class SybaseConnection implements Connection {

	private String url,username,password;
	
	@Override
	public void connect() {
		System.out.println("Connecting SYBASE with url : "+url+", username : "+username+", password : "+password);

	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting SYBASE!");

	}

	@Value("SybaseUrl")
	public void setUrl(String url) {
		this.url = url;
	}

	@Value("user1")
	public void setUsername(String username) {
		this.username = username;
	}

	@Value("password1")
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
