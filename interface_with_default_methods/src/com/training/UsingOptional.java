package com.training;

import java.util.Optional;

public class UsingOptional {

	public static Optional<String> getValue(int key){
		// TODO Auto-generated method stub
		Optional  <String> response = Optional.empty();
		if(key==1) {
			response=Optional.of("hi");
		}
		return response;
		}
	
		public static Object getString(int key) {
		switch(key) {
		case 1:
			
			return new String( "chocobar");
		case 2:
			
			return new StringBuffer("cassatta");
		default:
			return null;
			
		}
		
		

	}
	public static void main(String[] args) {
		//System.out.println(getString(3).toString());
		
		
		Optional<Object> optional =  Optional.ofNullable(getString(2));
		System.out.println(optional.orElse("vennila").toString());
		
		Optional<Object> opt2 = Optional.ofNullable(getString(2));
		if(opt2.isPresent()) {
			System.out.println("value is present"+ opt2.get());
		}else {
			System.out.println("value is absent");
		}
		Optional<Object> opt3 = Optional.ofNullable(getString(2));
		opt3.orElseThrow(() -> new RuntimeException("no object for value 3 try again"));
		Optional<String> resp  = getValue(3);
		if(resp.isPresent()) {
			System.out.println(resp.get().toString());
		}else {
			System.out.println("invalid choice enter 1");
		}
		resp.orElseThrow(() -> new RuntimeException("no value"));
				
	}

}
