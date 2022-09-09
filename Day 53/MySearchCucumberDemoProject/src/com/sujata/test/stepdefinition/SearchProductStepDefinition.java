package com.sujata.test.stepdefinition;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.sujata.demo.Product;
import com.sujata.demo.SearchProduct;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductStepDefinition {

	Product product;
	SearchProduct searchProduct;
	
	@Given("I have a search field on Amazon Page")
	public void i_have_a_search_field_on_amazon_page() {
	    System.out.println("Step 1 : We have search field on Amazon Page");
	}

	@When("I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
	    System.out.println("Step 2: I am searching for a product with name "+productName+" and price "+price);
	    product=new Product(productName, price);
	    
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
	    
		System.out.println("Step 3:Product with name "+productName+" shoould be displayed"+product.getProductName());
	    searchProduct=new SearchProduct();
	    
	    assertEquals(productName, searchProduct.getProduct(product));
	    
	}
}
