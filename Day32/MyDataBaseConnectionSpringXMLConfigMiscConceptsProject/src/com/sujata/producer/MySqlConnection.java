package com.sujata.producer;

public class MySqlConnection implements Connection {

	private String url,username,password;
	
	@Override
	public void connect() {
		System.out.println("Connecting MySQL with url : "+url+", username : "+username+", password : "+password);

	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting MySQL!");

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
