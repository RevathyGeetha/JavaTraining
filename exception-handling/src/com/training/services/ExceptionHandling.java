package com.training.services;

public class ExceptionHandling {
	public void usingArrayIndexException(String[] args) {
		try {
			System.out.println(args[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("method requires three value to be passed[a, d, c]");
			//e.printStackTrace();
		}
	}
	public void usingNumberFormatException(String value) {
		int age=0;
		try {
			age = Integer.parseInt(value);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("need to be integer");
			//e.printStackTrace();
		}
		
		System.out.println(age);
	}
    public String understandFinallyBlock() throws Exception {
      int denominator=4;
      try {
    	  System.out.println(4/denominator);
      }catch(ArithmeticException e) {
    	  System.out.println("denominator should not be zero");
    	  //return "welcome";
    	  throw new Exception();
      }
      finally {
    	  System.out.println("INSIDE FINALLY");
      }
      System.out.println("thanks,bye,bye");
    	  
      return "thanks";
	
}
}
