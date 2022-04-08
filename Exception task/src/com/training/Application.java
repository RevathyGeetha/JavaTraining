package com.training;

import com.training.model.InvalidEmailException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer ram = new Customer(101, "revathy",82482508256l, "revathygeetha1110");
		if(ram.getEmail()!=null) {
		System.out.println(ram.getCustomerId());
		System.out.println(ram.getEmail());
		}
		
		
		

	}

}
