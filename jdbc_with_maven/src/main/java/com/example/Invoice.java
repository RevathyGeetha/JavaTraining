package com.example;

import com.training.entity.product;

public class Invoice {
	private int invoice_number;
	private String customer_name;
	private int quantity;
	private int productRef;
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Invoice(int invoice_number, String customer_name, int quantity, int productRef) {
		super();
		this.invoice_number = invoice_number;
		this.customer_name = customer_name;
		this.quantity = quantity;
		this.productRef = productRef;
	}
	public int getInvoice_number() {
		return invoice_number;
	}
	public void setInvoice_number(int invoice_number) {
		this.invoice_number = invoice_number;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProductRef() {
		return productRef;
	}
	public void setProductRef(int productRef) {
		this.productRef = productRef;
	}
	@Override
	public String toString() {
		return "Invoice [invoice_number=" + invoice_number + ", customer_name=" + customer_name + ", quantity="
				+ quantity + ", productRef=" + productRef + "]";
	}
	
	
}
