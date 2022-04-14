package com.training;

import com.training.model.Student;
import java.util.*;
public class hashSetApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram = new Student(101, "rev", 98);
		Student geetha = new Student(102,"geetha",99);
		Student jaga = new Student(103, "jagan", 78);
		Student ajith = new  Student(103, "jagan", 78);
		
		HashSet<Student> set = new HashSet<>();
		set.add(ajith);
		set.add(jaga);
		set.add(geetha);
		set.add(ram);
		System.out.println(set);
		System.out.println(set.size());
		

	}

}
