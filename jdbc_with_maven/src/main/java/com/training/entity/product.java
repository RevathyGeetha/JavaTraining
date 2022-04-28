package com.training.entity;

public class product {
	private int productid;
	private String productName;
	private double price;
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public product(int productid, String productName, double price) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.price = price;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "product [productid=" + productid + ", productName=" + productName + ", price=" + price + "]";
	}
	
	

}
