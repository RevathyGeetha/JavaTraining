package com.example.demo;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String name = sc.next();
		System.out.println("enter the farenheit temp");
		double farentemp =sc.nextDouble();
		System.out.println("enter the amount");
		double  amount =sc.nextDouble();
		System.out.println("enter the current convert 1-USD 2-EURO");
		int frm = sc.nextInt();
		
		
		Converter convObj = new Converter();
		System.out.println(convObj.convert(name));
		System.out.println("celsius temp:="+convObj.convert(farentemp));
		System.out.println(convObj.convert(amount,frm));
		
		
		
		
		
		sc.close();
		
		

	}

}
