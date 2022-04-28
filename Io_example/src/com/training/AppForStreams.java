package com.training;

import java.io.File;

import com.training.model.Book;
import com.training.services.BookService;

public class AppForStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookService service = new BookService();
		File file = new File("book.ser");

		int ch=2;
		if(ch==1) {
			
		

		Book book = new Book(8867,"oracle","rev",560);
		boolean result = service.writeToStream(file, book);
		if(result) {
			System.out.println("one record serialized");
		}

	}else {
		Book fromFile = (Book) service.readFromStream(file);
		System.out.println(fromFile);
	}

	}
}
