package com.training;

import com.training.model.Automobile;

public class ToyotoCar implements Automobile {

	@Override
	public String Color() {
		// TODO Auto-generated method stub
		return "blue";
	}

	@Override
	public String Model() {
		// TODO Auto-generated method stub
		return "I40";
	}

	@Override
	public double Price() {
		// TODO Auto-generated method stub
		return 1000000;
	}

}
