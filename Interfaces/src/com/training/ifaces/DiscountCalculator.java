package com.training.ifaces;

public class DiscountCalculator implements Conditional {

	@Override
	public boolean test(int value) {
		// TODO Auto-generated method stub
		return value>4000;
	}

	@Override
	public boolean negate(int value) {
		// TODO Auto-generated method stub
		return value<500;
	}

}
