package com.example;

import java.util.logging.Logger;

public class Book implements Comparable<Book>{
	private int bookNumber;
	private String bookName;
	private String AuthorName;
	private double price;
	//logging
	static Logger log = Logger.getLogger(Book.class.getName());
	public Book() {
		super();
		// logging
		log.info("book with zero argument constructor");
	}
	public Book(int bookNumber, String bookName, String authorName, double price) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		AuthorName = authorName;
		this.price = price;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", AuthorName=" + AuthorName + ", price="
				+ price + "]";
	}
	@Override
	public int compareTo(Book otherObj) {
		// TODO Auto-generated method stub
		if(otherObj.bookNumber<this.bookNumber)
			return 1;
		if(otherObj.bookNumber<this.bookNumber)
			return -1;
		return 0;
		//return this.bookName.compareTo(otherObj.bookName);
	}
	

}
