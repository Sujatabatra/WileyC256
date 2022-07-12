package com.sujata.demo;

import java.util.ArrayList;

public class BookClient {

	public static void main(String[] args) {
		
		BookList bookList=new BookList();
//		ArrayList<Book> books=bookList.getAllBooks();
//		System.out.println(books);
//		
//		System.out.println("Books Written By Author M : "+bookList.getBooksWrittenByAuthorM());
//		
//		System.out.println("Expensive Books : "+bookList.getExpensiveBooks());
	
		ArrayList allBooks=bookList.getBooksByCriteria(new AllBookPredicate());
		
		System.out.println("Expensive Books : "+bookList.getBooksByCriteria(new ExpensiveBookPredicate()));
		
	}

}
