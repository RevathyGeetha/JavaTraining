package com.training.services;

import com.training.ifaces.CheckCondition;
import com.training.ifaces.Conditional;
import com.training.ifaces.DiscountCalculator;
import com.training.ifaces.Function;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//subtype = new sub type
		//CurrencyConverter conv = new CurrencyConverter();
		//supertype = subtype
		Function conv = new CurrencyConverter();
		
//		double response = conv.apply(200);
//		System.out.println(response);
		//line 8&9 and line 11 are same
		System.out.println(conv.Counter);
		System.out.println(conv.apply(300));
		if(conv instanceof CheckCondition)
		{
			CheckCondition obj =(CheckCondition)conv;
		
		System.out.println("is discount allowed:="+obj.test(300));
		}
		Conditional condObj = new DiscountCalculator();
		
		System.out.println(condObj.test(5000));
		System.out.println(condObj.negate(6000));
	}
	

}

