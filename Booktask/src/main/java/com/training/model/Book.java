package com.training.model;

public class Book {

	private String bookname;
	private int noofpages;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookname, int noofpages) {
		super();
		this.bookname = bookname;
		this.noofpages = noofpages;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getNoofpages() {
		return noofpages;
	}
	public void setNoofpages(int noofpages) {
		this.noofpages = noofpages;
	}
	@Override
	public String toString() {
		return "Book [bookname=" + bookname + ", noofpages=" + noofpages + "]";
	}
	
}
