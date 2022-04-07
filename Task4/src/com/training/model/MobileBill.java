package com.training.model;

public class MobileBill {
	private String CustomerName;
	private long MobileNumber;
	private String PlanName;
	private Address address;
	
	public static final String ServiceProviders = "jio";
	
	public MobileBill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MobileBill(String customerName, long mobileNumber, String planName, Address address) {
		super();
		CustomerName = customerName;
		MobileNumber = mobileNumber;
		PlanName = planName;
		this.address = address;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public long getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getPlanName() {
		return PlanName;
	}
	public void setPlanName(String planName) {
		PlanName = planName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
   public double AmountCalculation() {
	  double amount=0;
	  
	  
	switch (this.PlanName) {
	  case "prepaid":
		  amount = 200;
		  break;
	  case "postpaid":
		  amount = 300;
		  break;
	 default :
		 break;
	  
	  
	  }
	return amount;
   }
}
