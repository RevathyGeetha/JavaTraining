package com.training.model;

import java.util.HashSet;
import java.util.TreeSet;

import com.training.Product;

public class App2 {
	public static void main(String[] args) {
		Product p1 = new Product(101,"shampoo",3000);
		Product p2 = new Product(102,"soap",5000);
		Product p3 = new Product(103,"cosmatics",59887);
		Product p4 = new Product(104,"kajal",6790);
		Product p5 = new Product(105, "lipstick", 4500);
		
		TreeSet<Product> products = new TreeSet<>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		ProductService service = new ProductService(products);
		
	}
	

}
