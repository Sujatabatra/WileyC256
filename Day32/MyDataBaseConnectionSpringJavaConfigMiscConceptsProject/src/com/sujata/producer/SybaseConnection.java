package com.sujata.producer;

public class SybaseConnection implements Connection {

	private String url,username,password;
	
	public SybaseConnection() {
		System.out.println("SybaseConnection Constructor");
	}
	@Override
	public void connect() {
		System.out.println("Connecting SYBASE with url : "+url+", username : "+username+", password : "+password);

	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting SYBASE!");

	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
