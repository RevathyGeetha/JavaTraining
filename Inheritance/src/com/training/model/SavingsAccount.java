package com.training.model;

public class SavingsAccount extends BankAccount {
	private String nominee;
	//whenever subclass constructor is called its super class constructor also called.even super()keyword is not present

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(int accountNumber, String accountHolderName, double balance, String accountType,
			String nominee) {
		super(accountNumber, accountHolderName, balance, accountType);
		this.nominee = nominee;
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}
	
	
	
	
//	public SavingsAccount() {
//		System.out.println("constructor of subclass called");
//		
//		
//		
//		
//		
//		
//	}
//	
//public SavingsAccount() {
//	super(1020,"ram",5000);
//	System.out.println("constructor of subclass callled");
//	
//}
	
	
}
