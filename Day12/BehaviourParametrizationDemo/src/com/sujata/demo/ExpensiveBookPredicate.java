package com.sujata.demo;

public class ExpensiveBookPredicate implements BookPredicate {

	@Override
	public boolean test(Book book) {
		
		return book.getPrice()>2000;
	}

}
