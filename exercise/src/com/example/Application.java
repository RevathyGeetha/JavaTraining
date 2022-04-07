package com.example;
import com.example.demo.Customer;
import com.example_1.Employee;
import com.example_2.Hotel;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer rev = new Customer(33, "ram");
		System.out.println("id:"+rev.getId());
		System.out.println("name:"+rev.getName());
		Employee aaa = new Employee(2000, "rispa", 20);
		System.out.println("salary:"+aaa.getSalary());
		System.out.println("name:"+aaa.getName());
		System.out.println("id:"+aaa.getId());
		Hotel xxx = new Hotel(2000, "srk hotel", 45);
		System.out.println("rent:"+xxx.getRent());
		System.out.println("name:"+xxx.getName());
		System.out.println("id:"+xxx.getId());
		
		

	}

}
