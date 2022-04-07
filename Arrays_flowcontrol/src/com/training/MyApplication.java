package com.training;
import java.util.Scanner;

import com.training.model.BankAccount;
import com.training.services.BankAccountService;

public class MyApplication {
	public static void main(String[] args) {
		BankAccountService service = new BankAccountService();
		BankAccount[] list = new  BankAccount[2];
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		int i=0;
		do{
		 BankAccount account = new BankAccount();
		 System.out.println("enter the account number");
		 int accountNumber =  sc.nextInt();
		 System.out.println("enter the accountHolderName");
		 String accountHolderName = sc.next();
		 System.out.println("enter the balance");
		 double balance = sc.nextDouble();
		 System.out.println("enter the accountType name");
		 String accountType = sc.next();
		
		 BankAccount account2 = new BankAccount(accountNumber, accountHolderName, balance, accountType);
	     list[i]= account;
	     i++;
	     
	    
	     
	     System.out.println("enter 0 or 1");
		 choice = sc.nextInt();
                  
	     
				 
		}while(choice==1);
		   
		double[] values = service.findInterest(list);
		
		for(double eachValue: values) {
			System.out.println(eachValue);
		}
		
		
		sc.close();
		
	}

}
