package com.training.model;

import com.training.ifaces.Conditional;

public class Principal implements Conditional  {
	
	
	@Override
	public boolean test(Object value) {
		// TODO Auto-generated method stub
		String strLocation =(String)value;
		boolean result=false;
		if(this.TypeOfCollege.equals("engg")|| strLocation.equals("rural")) {
		result = true;
		}
		return result;
	}

	private String TypeOfCollege;

	public Principal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Principal(String typeOfCollege) {
		super();
		TypeOfCollege = typeOfCollege;
	}

	public String getTypeOfCollege() {
		return TypeOfCollege;
	}

	public void setTypeOfCollege(String typeOfCollege) {
		TypeOfCollege = typeOfCollege;
	}

	
}
