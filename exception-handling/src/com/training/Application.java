package com.training;

import com.training.model.Student;
import com.training.services.ExceptionHandling;
import com.training.services.StudentService;
import java.util.*;
public class Application {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Student ram = new Student(1010,"ramesh",-98);
		StudentService service = new StudentService(ram);
		
		System.out.println(service.sendDetails());
		
		StudentService service2 = new StudentService(ram);
		try {
			System.out.println("Grade:"+service2.findRank());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("name is not passed");
			
//			e.printStackTrace();
		}
		ExceptionHandling exHandling = new ExceptionHandling();
		exHandling.usingArrayIndexException(args);
		exHandling.usingNumberFormatException("fourtyfive");
		
		
		System.out.println(exHandling.understandFinallyBlock());
		//try with resource -scanner will be automatically used
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("enter number");
			int num = scan.nextInt();
			System.out.println(num);
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
