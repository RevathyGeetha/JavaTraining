package com.training;
import java.util.*;

import com.training.model.Student;
public class HashMapApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram = new Student(101, "rev", 98);
		Student geetha = new Student(102,"geetha",99);
		Student ajith = new Student(103,"jagan",87);
		HashMap<Integer, Student> map = new HashMap<>();
		
		System.out.println(map.put(105, ram));
		System.out.println(map.put(102, geetha));
		System.out.println(map.put(105, ajith));
		System.out.println(map.get(105));
		Student added  = map.put(105, ajith);
		if(added!=null) {
			map.put(109, added);
			
		}
			System.out.println(map.get(109));

	}

}
