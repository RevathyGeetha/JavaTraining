package com.example_3;
import java.util.*;

import com.example_1.Employee;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String name = sc.next();
		System.out.println("enter the id");
		int id = sc.nextInt();
		System.out.println("enter the sal");
		double sal = sc.nextDouble();
		
		Employee obj = new Employee(sal, name, id);
		EmployeeService service = new EmployeeService();
		System.out.println("employee bonus:"+service.calculateBonus(obj));
		sc.close();

	}
}