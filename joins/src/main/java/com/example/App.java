package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

import com.example.demo.services.Services;
import com.example.entity.Customer;
import com.example.entity.LoanApplication;
import com.exemple.utils.ConnectionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Connection con;
    	con=ConnectionFactory.getOracleConnection();
    	//System.out.println(con);
    	Services resp = new Services(con);
    	//resp.findAll().forEach(System.out::println);
//    	 int rowAdded = service.addproduct(toAdd);
    	 //System.out.println("row added:="+rowAdded);
//    	Customer cus = new Customer(105,"bbb",5498425689L,300);
//        LoanApplication toAdd = new LoanApplication(9, cus, 500);
//    	int rowAdded = resp.add(toAdd);
//    	System.out.println("rowAdded:="+rowAdded);
//   	 
    	
    	System.out.println(resp.findById(102));
    	//resp.findAll().forEach(System.out::println);


		
}
}