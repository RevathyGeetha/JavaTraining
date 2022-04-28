package com.training;

import java.io.File;

import com.training.model.Book;
import com.training.services.BookService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Book java = new Book(101, " java", "gee", 560);
		BookService service = new BookService();
		//boolean result = service.writeToFile(new File("Books.txt"),java);
		//if(result) {
			//System.out.println("one record added to file");
		//}
		service.readFromFile(new File("Books.txt")).forEach(System.out::println);

	}

}
