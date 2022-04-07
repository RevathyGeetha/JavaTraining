package com.training.services;

import com.training.model.BankAccount;;

public class Aplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccountService service = new BankAccountService();
		 BankAccount ram = new BankAccount(5000, "ramesh", 5000);
		 BankAccount shyam = new BankAccount(6200, "reva", 5000);
		 double simpleInterest = service.calculateInterest(ram);
		 double simpleInterest1 = service.calculateInterest(shyam);
		 System.out.println("simpleInterest:="+ simpleInterest);
		 System.out.println("simpleIInterest:="+ simpleInterest1);
		 //BankAccount[] accounts= new BankAccount [2];
		 //accounts[0] = ram;
		 //accounts[1] = shyam;
		 BankAccount[] accounts = {ram,shyam};
		 service.calculateInterest(accounts);
		 double[] values = service.findInterest(accounts);
		 for(double eachValue: values) {
			 
			 System.out.println(eachValue);
		 }
		 BankAccount[] accountList = {
				 new BankAccount(800, "ram", 5000, "savings"),
				 new BankAccount(801, "rev", 7000, "fixed"),
				 new BankAccount(802, "shyy", 8000, "recurring")
		 };
		 
		 double[] interestValues = service.findInterestByAccountType(accountList);
              for(double eachValue: interestValues) {
            	  System.out.println(eachValue);
              }
            	  
              }
	}


