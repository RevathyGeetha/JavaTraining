package com.training.services;

import com.training.ifaces.Converter;

public class Application {
    public static void print(Converter<Double, Double> conv) {
    	System.out.println(conv.convert(100.00));
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Converter <Double,Double> obj = new CurrencyConverter();
		
		System.out.println(obj.convert(20.0));
		Converter<Double, Double> lamda = (val)->val *200.0;
		//System.out.println(lamda.convert(20.00));
		print(lamda);
		Converter<String, Integer>  strLength= (str)->str.length();
		System.out.println(strLength.convert("chennai"));
 
	}

}
 