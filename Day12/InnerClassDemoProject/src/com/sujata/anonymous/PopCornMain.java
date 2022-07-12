package com.sujata.anonymous;

public class PopCornMain {

	public static void main(String[] args) {
		PopCorn popCorn=new PopCorn();
		
		popCorn.pop();
		popCorn.price(50);
		
		popCorn=new PopCorn() {
			@Override
			public void pop() {
				System.out.println("Butter PopCorn is Popping");
			}
			
			@Override
			public void price(int price) {
				System.out.println("Kindly Pay Rs."+price+" for Butter PopCorn");
			}
		};

		popCorn.pop();
		popCorn.price(60);
		System.out.println("=======================");
		FoodCourt foodCourt=new FoodCourt();
		foodCourt.setPopCorn(new PopCorn() {
			@Override
			public void pop() {
				System.out.println("Salt and Pepper PopCorn is Popping");
			}
			
			@Override
			public void price(int price) {
				System.out.println("Kindly Pay Rs."+price+" for Salt and Pepper PopCorn");
			}
		});
		
		foodCourt.buy(80);
		
	}

}
