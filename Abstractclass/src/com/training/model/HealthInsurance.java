package com.training.model;

public class HealthInsurance extends Insurance {
	private String[] disease;

	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		double premium = 10000;
		for(String eachItem:disease) {
			String item = eachItem.toLowerCase();
			if(eachItem.equals("BP")||eachItem.equals("sugar")){
				premium = 15000;
			}
		}
		return premium;
	}

	public HealthInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HealthInsurance(int policyNumber, String policyHolderName, String[] disease) {
		super(policyNumber, policyHolderName);
		this.disease = disease;
	}

	public String[] getDisease() {
		return disease;
	}

	public void setDisease(String[] disease) {
		this.disease = disease;
	}

}