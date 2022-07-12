package com.sujata.anonymous;

public class FoodCourt {

	private PopCorn popCorn;

	public void setPopCorn(PopCorn popCorn) {
		this.popCorn = popCorn;
	}
	
	public void buy(int price) {
		popCorn.price(price);
		popCorn.pop();
	}
}
