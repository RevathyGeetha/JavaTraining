package com.training;
import java.util.*;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;
import com.training.serivices.BookService;
import com.training.util.BookNameCompartor;
public class App {
	 public static void print( List<Book> books  ) {
	    	
	    	for(Book eachBook:books) {
				System.out.println(eachBook);
	    }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names =  new ArrayList<>();
		names.add("barani");
		names.add("revathy");
		names.add("geetha");
		names.add("dhavapu");
		names.add("jagan");
		
		
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		
		
		Book java = new Book(101, "java","suba",450);
		Book Spring = new Book(102, "Spring","Mad",650);
		Book maven = new Book(103, "maven","harish",550);
		Book html = new Book(104, "html","priya",1450);
		Book python = new Book(105, "python","sathya",850);
		
		CrudRepository service = new BookService();
		System.out.println(service.add(java));
		System.out.println(service.add(Spring));
		service.add(maven);
		service.add(html);
		service.add(python);
		
		List<Book> bookList = service.findAll();
		Collections.sort(bookList);
		//System.out.println(bookList);
		print(bookList);
		
		
		Collections.sort(bookList,new BookNameCompartor());
		System.out.println("sort by book name");
		print(bookList);

	}

}
