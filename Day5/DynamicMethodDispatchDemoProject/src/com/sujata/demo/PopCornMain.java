package com.sujata.demo;

public class PopCornMain {

	public static void main(String[] args) {
		/* Dynamic method Dispatch
		 * Base class reference variable is  type compatible with derived class Object,
		 * but the reverse is not true
		 */
//		
//		PopCorn p1;
//		
//		p1=new ButterPopCorn();
//		
////		ButterPopCorn p2=new PopCorn();
//		p1.pop();
//		
//		p1=new CaramelPopCorn();
//		p1.pop();
//		
//		p1=new PopCorn();
//		p1.pop();

		
		FoodCourt foodCourt=new FoodCourt();
		foodCourt.buyPopCorn(new ButterPopCorn());
		
		foodCourt.buyPopCorn(new CaramelPopCorn());
		
		foodCourt.buyPopCorn(new CheesePopCorn());
	}

}
