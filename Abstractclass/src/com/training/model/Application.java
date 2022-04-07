package com.training.model;

public class Application {
	public static void printpremium(Insurance object) {
		System.out.println("premium:="+object.calculatePremium());
	}
	
	public static void main(String[] args) {
		vechicleInsurance car = new vechicleInsurance(1010, "rev","car", 2019);
		printpremium(car);
		LifeInsurance life = new LifeInsurance(111, "rev", 50);
		
		
		
		printpremium(life);
		String[] illness = {"bp","sugar","ent","thyroid"};
		HealthInsurance health = new HealthInsurance(101, "rev",illness );
		printpremium(health);
	}

}