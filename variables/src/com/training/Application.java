package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount("ramesh",1000);
		System.out.println(account.getUpdatedBalance(3888));
		System.out.println(account.getAccountNumber());
		System.out.println(account.getUpdatedBalance(3000));
		//System.out.println(BankAccount.getCount());
		//System.out.println(BankAccount.getCount());
		
		//System.out.println(account.getAccountNumber());
        BankAccount account2 = new BankAccount("suresh",2000);
        System.out.println(account2.getUpdatedBalance(3000));
        System.out.println(account2.getAccountNumber());

	}

}
