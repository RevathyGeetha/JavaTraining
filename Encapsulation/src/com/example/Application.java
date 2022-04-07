package com.example;

import com.example.model.Student;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram = new Student();
		//ram.rollNumber = 101;
		
		//default method unable to access it because it is in different packages
		//ram.setRollNumber(56009);
		//unable to access because Application is not a subclass of student
		//ram.setFirstName("ram");
		//unable to access because method is private in student class
		//ram.setMarkScored(90);
		
		ram.setBranch("BE");
		System.out.println("Roll Number :="+ram.getRollNumber());
        System.out.println("Mark Scored:="+ram.getMarkScored());
        System.out.println("Student Name:="+ram.getFirstName());
        System.out.println("Branch Name:="+ram.getBranch());
        
        Student shyam = new Student(45,"shyam",36,"BE");
        System.out.println("Roll Number="+shyam.getRollNumber());
        Student magesh = new Student(23,"mahesh","BE");
        System.out.println("Student Name="+shyam.getMarkScored());
	}

}
