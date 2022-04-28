package com.example.demo;
import java.sql.*;
import java.util.Optional;

import com.example.demo.services.productService;
import com.example.entity.product;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		try {
			 con = DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			 productService service = new productService(con);
//			 product toAdd = new product(10,"ups",17470.00);
//			 product toAdd1 = new product(11,"flask",2672.00);
//			 int rowAdded = service.addproduct(toAdd1);
//			 int todelete = service.deleteById(1);
			 int update = service.updatePriceByName("fan", 500);
			 //System.out.println("rowsUpdate:="+update);
			 service.findAll().forEach(System.out::println);
//			 Optional<product> findId = service.findById(10);
//			 if(findId.isPresent()) {
//				 System.out.println(findId.get());
//			 }else {
//				 System.out.println("not present");
//			 }
//			 //service.findAll().forEach(System.out::println);
			 //System.out.println("rows delete:="+findId);

			 //System.out.println("rows delete:="+todelete);
			 //System.out.println("row added:="+rowAdded);
			//service.findAll().forEach(System.out::println);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

