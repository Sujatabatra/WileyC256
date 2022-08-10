package com.sujata.producer;

public class DbConnection {

	private Connection connection;
	
	public DbConnection() {
		System.out.println("DbConnection Constructor");
	}
	public void dbConnect() {
		connection.connect();
	}
	
	public void dbDisconnect() {
		connection.disconnect();
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	
}
