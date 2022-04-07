package com.training;
import com.training.model.BankAccount;
import com.training.model.SavingsAccount;
import com.training.services.BankAccountService;

public class Application {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		BankAccount account = new BankAccount(1010, "ramesh", 5000, "savings");
//		System.out.println(account);
//		
	SavingsAccount account = new SavingsAccount(101,"rev", 400, "joint", "ram");
    System.out.println(account.getAccountHolderName());
    System.out.println(account.getNominee());
    SavingsAccountService service = new SavingsAccountService();
    System.out.println(service.getcustomerInfo(account));
    System.out.println(service.calculateInterest(account));
    BankAccountService service2 = new SavingsAccountService();
    // cannot access the subclass methopd with super class reference
    //servicce2.getCustomerInfo(account);
    SavingsAccountService savingservice2 =(SavingsAccountService)service2;
    BankAccountService sc2 = new SavingsAccountService();
   
    System.out.println(savingservice2.getcustomerInfo(account));
	}

} 