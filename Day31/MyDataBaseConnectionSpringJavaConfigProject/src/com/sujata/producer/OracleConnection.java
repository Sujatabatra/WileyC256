package com.sujata.producer;

public class OracleConnection implements Connection {

	private String url,username,password;
	
	
	public OracleConnection(String url, String username, String password) {
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
