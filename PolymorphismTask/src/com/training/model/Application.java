package com.training.model;

import com.training.utils.ObjectFactory;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectFactory factory = new ObjectFactory();
		Automobile marutiObj = factory.getObject(1);
		Automobile toyotoObj = factory.getObject(2);
		factory.printQuote(marutiObj);
		factory.printQuote(toyotoObj);

	}

}
