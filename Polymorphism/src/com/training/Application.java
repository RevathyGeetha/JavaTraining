package com.training;

import com.training.ifaces.Conditional;
import com.training.utils.ObjectFactory;
import com.training.model.NewObjectFactory;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectFactory factory = new NewObjectFactory();
		Conditional profObj = factory.getConditional(1);
		Conditional studObj = factory.getConditional(2);
		
		Conditional principalobj = factory.getConditional(3);
		//System.out.println(object.test("chennai"));
		System.out.println("allowance:="+factory.getValue(profObj, "chennai"));
		System.out.println("allowance:="+factory.getValue(studObj, "89"));
        System.out.println("allowance:="+factory.getValue(principalobj, "engg"));
	}

}
;