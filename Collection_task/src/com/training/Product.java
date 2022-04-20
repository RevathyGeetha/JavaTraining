package com.training;

public class Product {
	private int productId;
	private String productName;
	private double rateperunit;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName, double rateperunit) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.rateperunit = rateperunit;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getRateperunit() {
		return rateperunit;
	}
	public void setRateperunit(double rateperunit) {
		this.rateperunit = rateperunit;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", rateperunit=" + rateperunit
				+ "]";
	}
	

}
