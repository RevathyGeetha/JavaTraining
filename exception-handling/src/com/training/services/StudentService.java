package com.training.services;

import com.training.model.Student;

public class StudentService {
	private Student student;

	public StudentService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentService(Student student) {
		super();
		this.student = student;
	}
	public String sendDetails() {
		String name = null;
		try {
		name= this.student.getFirstName();
		}catch (NullPointerException e) {
			System.err.println("student object is not passed check again");
		}
		 return name;
	}
	public String findRank() throws Exception {
		String grade ="A";
		if(this.student.getMarkScored()>90) {
			grade ="0";
		}
		return grade;
	}

}
