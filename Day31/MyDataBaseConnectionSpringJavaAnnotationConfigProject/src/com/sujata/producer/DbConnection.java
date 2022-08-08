package com.sujata.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DbConnection {

	private Connection connection;
	
	public void dbConnect() {
		connection.connect();
	}
	
	public void dbDisconnect() {
		connection.disconnect();
	}

	@Autowired
	@Qualifier("sybase")
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	
}
