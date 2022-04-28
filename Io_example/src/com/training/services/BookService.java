package com.training.services;
import java.io.*;
import java.util.*;

import com.training.model.Book;

public class BookService {
	public Object readFromStream(File file) {
		
       Object obj =null;
       try (ObjectInputStream inputstream = new ObjectInputStream(new FileInputStream(file))){
    	  obj = inputstream.readObject();
		
	} catch (IOException | ClassNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
       return obj;
       
       
       
       
}
	
	public boolean writeToStream(File file,Book book) {
		boolean result = false;
		try (ObjectOutputStream outputstream = new ObjectOutputStream(new FileOutputStream(file))){
			
			outputstream.writeObject(book);
			result = true;
			
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
		
		
		
		
		
		
		
	}
	public boolean writeToFile(File file, Book book) {
		boolean result = false;
		
		try(PrintWriter writer = new PrintWriter(new FileWriter (file,true));)
		{
			writer.println(book);
			result = true;
		}catch(IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	public List<Book> readFromFile(File file){
		List<Book>bookList = new ArrayList<Book>();
		String line = null;
		try(BufferedReader reader = new BufferedReader(new FileReader(file))){
			while((line=reader.readLine())!=null) {
				String[] values = line.split(",");
				Book book = new Book(Integer.parseInt(values[0]), values[1], values[2],
						Double.parseDouble( values[3]));
				bookList.add(book);
				
			}

			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		
		
		return bookList;
	}

}
