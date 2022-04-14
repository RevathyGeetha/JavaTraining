package com.training.model;

public class CreditCard {
	private double cardnumber;
	private String cardHolderName;
	private int amountdue;
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCard(double cardnumber, String cardHolderName, int amountdue) {
		super();
		this.cardnumber = cardnumber;
		this.cardHolderName = cardHolderName;
		this.amountdue = amountdue;
	}
	public double getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(double cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public int getAmountdue() {
		return amountdue;
	}
	public void setAmountdue(int amountdue) {
		this.amountdue = amountdue;
	}
	@Override
	public String toString() {
		return "CreditCard [cardnumber=" + cardnumber + ", cardHolderName=" + cardHolderName + ", amountdue="
				+ amountdue + "]";
	}
	

}
