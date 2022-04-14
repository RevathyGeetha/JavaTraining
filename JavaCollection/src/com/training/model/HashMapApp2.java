package com.training.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram = new Student(101, "rev", 98);
		Student geetha = new Student(102,"geetha",99);
		Student ajith = new Student(103,"jagan",87);
		
		HashMap<Integer,Student> map = new HashMap<>();
		map.put(900, ram);
		map.put(901, geetha);
		map.put(902,ajith);
		
//		System.out.println(map.get(901));
//		System.out.println(map.get(901));
//		System.out.println(map.get(902));
//		
		
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		
		for(Integer key : keys) {
			System.out.println(map.get(key));
		}
                Collection<Student> list = map.values();
                for(Student eachStudent:list){
                	System.out.println(eachStudent);
                }
                Set<Map.Entry<Integer, Student>> list2 = map.entrySet();
                for(Map.Entry<Integer, Student> eachEntry:list2) {
                	System.out.println(eachEntry.getKey());
                	System.out.println(eachEntry.getValue());
                }
	}

}
