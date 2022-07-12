package com.sujata.setdemos;

import java.util.Objects;

public class Kitab{

	private int bookId;
	private String bookName;
	private String authorName;
	private int price;
	private int noOfPages;
	
	public Kitab() {
		
	}

	public Kitab(int bookId, String bookName, String authorName, int price, int noOfPages) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
		this.noOfPages = noOfPages;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", price=" + price
				+ ", noOfPages=" + noOfPages + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(authorName, bookId, bookName, noOfPages, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kitab other = (Kitab) obj;
		return Objects.equals(authorName, other.authorName) && bookId == other.bookId
				&& Objects.equals(bookName, other.bookName) && noOfPages == other.noOfPages && price == other.price;
	}


}
