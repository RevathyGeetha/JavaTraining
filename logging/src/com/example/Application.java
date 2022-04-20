package com.example;
import java.util.logging.*;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log = Logger.getLogger("com.example.Application");
		log.setLevel(Level.FINE);
		log.info("info message");
		//System.out.println("info message");
		log.warning("warning message.....");
		log.severe("severe message.....");
		log.fine("fine message......");

	}

}
