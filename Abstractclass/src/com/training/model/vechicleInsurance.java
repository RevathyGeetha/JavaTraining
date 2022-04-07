package com.training.model;

public class vechicleInsurance extends Insurance {
	private String vechicleModel;
	private int yearofManufacture;

	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		double premium = 1000;
		if(yearofManufacture<2020&& vechicleModel.equals("car")) {
			premium = 2000;
		}
		return premium;
	}

	public vechicleInsurance(int policyNumber, String policyHolderName,  String vechicleModel,
			int yearofManufacture) {
		super(policyNumber, policyHolderName);
		this.vechicleModel = vechicleModel;
		this.yearofManufacture = yearofManufacture;
	}

	public String getVechicleModel() {
		return vechicleModel;
	}

	public void setVechicleModel(String vechicleModel) {
		this.vechicleModel = vechicleModel;
	}

	public int getYearofManufacture() {
		return yearofManufacture;
	}

	public void setYearofManufacture(int yearofManufacture) {
		this.yearofManufacture = yearofManufacture;
	}
   
}
