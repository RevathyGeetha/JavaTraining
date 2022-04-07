package com.training.utils;

import com.training.MarutiCar;
import com.training.ToyotoCar;
import com.training.model.Automobile;

public class ObjectFactory {
	public Automobile getObject(int key) {
		switch (key) {
		case 1:
			return new MarutiCar();
		case 2:
			return new ToyotoCar();
			
			

		default:
			return null;
		}
	}
	public void printQuote(Automobile poly) {
		System.out.println("color "+poly.Color());
		System.out.println("model "+poly.Model());
		System.out.println("price "+poly.Price());
	}
	
	

}
