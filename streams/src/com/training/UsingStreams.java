package com.training;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import com.training.model.*;

public class UsingStreams {
	public static void useDistinct(List<Book> bookList) {
		bookList.stream().distinct().forEach(System.out::println);
	}
	public static void collectToSet(List<Book> bookList) {
		Set<Book> bookSet = bookList.stream().filter(e -> e.getPrice()>500).collect(toSet());
		bookSet.forEach(System.out::println);
	}
	public static void collectToMap(List<Book> bookList) {
		//Set<Book> bookSet = bookList.stream().collect(toSet());
		Map<String,Double> values = bookList.stream().filter(e -> e.getPrice()>500).distinct()
				.collect(toMap(Book::getBookName, Book::getPrice));
		values.forEach( (key,value) -> System.out.println(key +","+value));
	}
	public static void findMaxPrice(List<Book> bookList) {
		Optional<Book> optional = bookList.stream().max(Comparator.comparing(Book::getPrice));
		if(optional.isPresent()) {
			System.out.println("maximum price:="+optional.get().getPrice());
		}
	}
		public static void findMinPrice(List<Book> bookList) {
			Optional<Book> optional = bookList.stream().min(Comparator.comparing(Book::getPrice));
			if(optional.isPresent()) {
				System.out.println("minimum price:="+optional.get().getPrice());
			}
			
		}
		public static void count(List<Book> bookList) {
			long values = bookList.stream().filter(e ->e.getBookName().contains("v"))
					.count();
			System.out.println("count:"+values);
		}         
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book java = new Book(101, "java","suba",450);
		Book spring = new Book(102, "Spring","Mad",650);
		Book maven = new Book(103, "maven","harish",550);
		Book html = new Book(104, "html","priya",1450);
		Book python = new Book(105, "python","sathya",850);
		Book maven1 = new Book(103, "maven","harish",550);
		Book html1 = new Book(104, "html","priya",1450);
		
		List<Book> bookList = Arrays.asList(java,spring,maven,html,python,maven1,html1);
		int key=6;
		switch (key) {
		
		case 1:
			useDistinct(bookList);
			
			break;
		case 2:
			collectToSet(bookList);
			break;
		case 3:
			collectToMap(bookList);
			break;
		case 4:
			findMaxPrice(bookList);
			break;
		case 5:
			findMinPrice(bookList);
			break;
		case 6:
			count(bookList);
			break;

		default:
			break;
		}
		//useDistinct(bookList);
		//collectToSet(bookList);
		//collectToMap(bookList);
		//findMaxPrice(bookList);
	}

}
