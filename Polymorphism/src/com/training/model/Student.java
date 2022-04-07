package com.training.model;

import com.training.ifaces.Conditional;

public class Student implements Conditional {
	private double MarkScored;
	

	public double isMarkScored() {
		return MarkScored;
	}


	public void setMarkScored(double markScored) {
		this.MarkScored = markScored;
	}


	public Student(double markScored) {
		super();
		this.MarkScored = markScored;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public boolean test(Object value) {
		// TODO Auto-generated method stub
		String strBranch = (String)value;
		boolean result = false;
		if(this.MarkScored >80 && strBranch.equalsIgnoreCase("ece")) {
			result = true;
		}
		return result;
	}
	

}
