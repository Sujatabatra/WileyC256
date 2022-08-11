package com.sujata.model.service;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

	@Override
	public String getMessage() {
		return "Welcome to first Spring Boot MVC Demo at "+new Date();
	}

}
