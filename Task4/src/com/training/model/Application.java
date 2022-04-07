package com.training.model;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address address = new Address(01," ssrnagar", "ambedkar", "cuddalore");
		MobileBill revBill = new MobileBill("rev", 8248240826L, "prepaid", address);
		MobileBill ramBill = new MobileBill("rev", 8248240826L, "postpaid", address);
		
		System.out.println(revBill.getCustomerName());
		System.out.println(revBill.getAddress());
		System.out.println(revBill.AmountCalculation());
		System.out.println(ramBill.AmountCalculation());

	}

}
