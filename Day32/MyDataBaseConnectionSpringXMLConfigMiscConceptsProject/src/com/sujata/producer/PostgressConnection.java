package com.sujata.producer;

public class PostgressConnection implements Connection {

	private String url,username,password;
	
	
	public PostgressConnection(String url, String username, String password) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
	}

	@Override
	public void connect() {
		System.out.println("Connecting POSTGRESS with url : "+url+", username : "+username+", password : "+password);

	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting POSTGRESS!");

	}

}
