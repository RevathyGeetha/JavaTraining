package com.training.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

import com.training.Sorting;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> fruit = new ArrayList<>();
		
		fruit.add( "apple");
		fruit.add( "orange");
		fruit.add( "apple");
		fruit.add( "pineapple");
		fruit.add( "orange");
		fruit.add( "banana");
		Collections.sort(fruit);
		TreeSet<String> set = new TreeSet<>();
		set.addAll(fruit);
		System.out.println(set);
		
		
			}
}
		
	

	

