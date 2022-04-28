package com.training;

import java.sql.Connection;
import com.training.entity.product;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

import com.example.Invoice;
import com.example.demo.services.productService;
import com.exemple.utils.ConnectionFactory;
import com.training.dao.MemberRepository;
import com.training.entity.Member;


/**
 * Hello world!
 *
 */
public class App 
{
	public static void member() {
		
	}
	public static void product() {
		Connection con= ConnectionFactory.getPostgressConnection();
		 productService service = new productService(con);
		 product toAdd = new product(10,"ups",17470.00);
	 int rowAdded = service.addproduct(toAdd);
	 System.out.println("row added:="+rowAdded);
	 
		
	}
    public static void main( String[] args )
    {
    	Connection con;
		try {
			con = ConnectionFactory.getOracleConnection();
              //con= ConnectionFactory.getPostgressConnection();
			 productService service = new productService(con);

			 product pro = new product(19, "bbb ", 750);
			 Invoice pro1 = new Invoice(5, "xsds", 2, 19);
			 service.usingTxnWithCatchBlock(pro, pro1);

              //System.out.println(con);
			 //MemberRepository rep = new MemberRepository(con);
			 //rep.findAll().forEach(System.out::println);
			 //Member toadd = new Member(101, "BBB", "CCC",LocalDate.of(2022, 05, 05), "LIFETIME", 600, 3, 400);
             
			 //int rowAdded = rep.add(toadd);
			// System.out.println("rowadded:="+toadd);
              //product();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
}
