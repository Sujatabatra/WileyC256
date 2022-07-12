package com.sujata.demo;

import java.util.ArrayList;

public class BookList {
	
	ArrayList<Book> bookList=new ArrayList<Book>();
	
	public BookList() {
		bookList.add(new Book(101, "Book 1", "Author A", 1200, 870));
		bookList.add(new Book(102, "Book 2", "Author Y", 2100, 9070));
		bookList.add(new Book(103, "Book 3", "Author M", 8000, 1770));
		bookList.add(new Book(104, "Book 4", "Author A", 2000, 1890));
		bookList.add(new Book(105, "Book 5", "Author M", 5600, 750));
		bookList.add(new Book(106, "Book 6", "Author M", 8900, 8170));
	}
	
	public ArrayList<Book> getAllBooks(){
		return bookList;
	}
	
	public ArrayList<Book> getBooksWrittenByAuthorM(){
		ArrayList<Book> newBookList=new ArrayList<Book>();
		for(Book book:bookList) {
			if(book.getAuthorName().equals("Author M"))
				newBookList.add(book);
		}
		return newBookList;
	}
	
	public ArrayList<Book> getExpensiveBooks(){
		ArrayList<Book> newBookList=new ArrayList<Book>();
		for(Book book:bookList) {
			if(book.getPrice()>2000)
				newBookList.add(book);
		}
		return newBookList;
	}

	
	public ArrayList<Book> getBooksByCriteria(BookPredicate bookPredicate){
		ArrayList<Book> newBookList=new ArrayList<Book>();
		for(Book book:bookList) {
			if(bookPredicate.test(book))
				newBookList.add(book);
		}
		return newBookList;
	}
}
