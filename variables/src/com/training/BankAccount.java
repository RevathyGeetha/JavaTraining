package com.training;

public class BankAccount {
	//static variable
	private static int count;
	//instance variable
	private String accountableHolderName;
	private double balance;
	private int accountNumber;
	//static method
	public static int getCount() {
		
		return ++count;
	}
	public double getUpdatedBalance(double amount) {//parameter variable
		//local variable
		
	     double updatedBalance;
	     
	     double currentBalance =0;
	     
	    // System.out.println(updatedBalance);
	     currentBalance = this.balance+ amount;
	     this.balance=currentBalance;
	     return currentBalance;
	     
	}
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(String accountableHolderName, double balance) {
		super();
		this.accountableHolderName = accountableHolderName;
		this.balance = balance;
		this.accountNumber=getCount();
	}
	public String getAccountableHolderName() {
		return accountableHolderName;
	}
	public void setAccountableHolderName(String accountableHolderName) {
		this.accountableHolderName = accountableHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static void setCount(int count) {
		BankAccount.count = count;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	

}
