package com.training.model;

public class Address {
	private int doorno;
	private String streetName;
	private String city;
	private String district;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int doorno, String streetName, String city, String district) {
		super();
		this.doorno = doorno;
		this.streetName = streetName;
		this.city = city;
		this.district = district;
	}
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.doorno+this.streetName+this.getCity()+this.getDistrict();
	}
	
	
	

}
