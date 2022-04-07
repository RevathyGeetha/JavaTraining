package com.example_3;
import com.example_1.Employee;
public class EmployeeService {
	

	public double calculateBonus( Employee object) {
		return(0.33)*object.getSalary();
	}
	

}
