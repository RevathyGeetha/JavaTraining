package com.training.model;

import com.training.Customer;

public class InvalidEmailException extends Exception {
	public String message;
	
	
	

	public InvalidEmailException(String message) {
		super();
		this.message = message;
	}




	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}


}
