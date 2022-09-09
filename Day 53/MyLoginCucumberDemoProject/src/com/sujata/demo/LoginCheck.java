package com.sujata.demo;

public class LoginCheck {

	public boolean login(User user) {
		return user.getUsername().equals(user.getPassword());
	}
}
