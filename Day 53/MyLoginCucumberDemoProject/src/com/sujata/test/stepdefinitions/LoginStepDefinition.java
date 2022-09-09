package com.sujata.test.stepdefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.sujata.demo.LoginCheck;
import com.sujata.demo.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	User user;
	LoginCheck loginCheck;
	
	@Given("I am on login page")
	public void i_am_on_login_page() {
	    System.out.println("Step 1: I am on login Page");
	}

	@When("I enter username as {string} and password as {string}")
	public void i_enter_username_as_and_password_as(String username, String password) {
	    System.out.println("Entering username : "+username+" password : "+password);
	    user=new User(username, password);
	}

	@Then("Show Home Page with welcome message as welcome {string}")
	public void show_home_page_with_welcome_message_as_welcome(String username) {
	    System.out.println("Showing welcome "+username+" on home page ");
	    loginCheck=new LoginCheck();
	    assertTrue(loginCheck.login(user));
	}

}
