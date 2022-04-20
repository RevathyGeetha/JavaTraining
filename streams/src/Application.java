

import java.util.List;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;
import com.training.serivices.BookService;

public class Application {
    public static void print( List<Book> books  ) {
    	
    	for(Book eachBook:books) {
			System.out.println(eachBook);
    }
    	//books.forEach(eachBook);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		//print(service.findAll());
		

		
		
//		for(Book eachBook:bookList) {
//			System.out.println(eachBook);
//		}
//		
		Book foundBook = service.findById(105);
		System.out.println(foundBook);
		
		
		
		service.remove(python);
		List<Book> secondList = service.findAll();
		System.out.println(service.findAll().size());
		print(service.findAll());
		Book react = new Book(205, "reactjs","rev",6850);
		service.add(react);
		print(service.findAll());
		
		Book reactNew = new Book(205,"reactjs","rev",7850);
		
		service.update(react,reactNew);
		System.out.println("==========after update=======");
		print(service.findAll());
		System.out.println("greater than");
		List<Book> bookList = ((BookService)service).getBooksGrtThan(800);
		bookList.forEach(System.out::println);
		
		
		System.out.println("using streams");
		((BookService)service).findBooksGrtThan(700).forEach(System.out::println);
		
		
		System.out.println("====map ===");
		List<String> nameList = ((BookService)service).getbookNames();
		nameList.forEach(System.out::println);
		
		System.out.println("===========**********");
		List<String> grtThanNineHundred = ((BookService)service).getBookNameGrtThanPrice(900);
		grtThanNineHundred.forEach(System.out::println);
		
		System.out.println("#################");
		List<Book> sortedByName =((BookService)service).sortedByName();
		sortedByName.forEach(System.out::println);
		
		
		System.out.println("&&&&&&&&&&&&&&&");
		List<Book> sortedByNumberDesc = ((BookService)service).sortedByNumberdesc();
		sortedByNumberDesc.forEach(System.out::println);
	
		
		
	}

}
