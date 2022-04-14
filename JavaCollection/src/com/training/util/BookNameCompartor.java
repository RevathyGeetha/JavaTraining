package com.training.util;

import java.util.Comparator;

import com.training.model.Book;

public class BookNameCompartor implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getBookName().compareTo(o2.getBookName());
	}

}
