package com.example_2;

public class Hotel {
	private double rent;
	private String name;
	private int id;{
		
	}

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
		
	}

	public Hotel(double rent, String name, int id) {
		super();
		this.rent = rent;
		this.name = name;
		this.id = id;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
