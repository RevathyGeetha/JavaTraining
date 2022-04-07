package com.example_1;

public class Employee {
	private double salary;
	private String name;
	private int id;{
		
		
		
	}



	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		
	}



	public Employee(double salary, String name, int id) {
		super();
		this.salary = salary;
		this.name = name;
		this.id = id;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
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
