package com.training;

import java.util.HashSet;
import java.util.TreeSet;

import com.training.model.Student;

public class TreeSetApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram = new Student(101, "rev", 98);
		Student geetha = new Student(102,"geetha",99);
		Student jaga = new Student(103, "jagan", 78);
		Student ajith = new  Student(103, "jagan", 78);
		
		TreeSet<Student> set = new TreeSet<>();
		set.add(ajith);
		set.add(jaga);
		set.add(geetha);
		set.add(ram);
		for(Student eachStudent:set) {
			System.out.println(eachStudent.getFirstname());
		}

	}

}
