package com.example;

import java.io.IOException;
import java.util.logging.FileHandler;

public class LoggingWithPropAndSaveToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file = LoggingWithPropFile.class.getClassLoader().getResource("logging.properties")
				.getFile();
		
		System.setProperty("java.util.logging.config.filr", file);
		FileHandler handler;
		try {
			handler = new FileHandler("logs2.log");
			Book.log.addHandler(handler);

		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Book.log.info("logging properties done right");
		Book java = new Book();
		Book.log.info(java.toString());



	}

}
