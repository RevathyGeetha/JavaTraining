package com.example;
import java.util.*;
import java.sql.*;
import java.sql.Date;
import java.time.*;

public class WorkingWithDifferentDateClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step1 creating util date
		java.util.Date date1 = new  java.util.Date();
		//java.sql.Date date2 = new java.sql.Date(10111999);
		System.out.println(date1);
		//step2 util date to sql date
		java.sql.Date date2 = new java.sql.Date(date1.getTime());
		System.out.println(date2);
		//step 3 sql date to localdate
		LocalDate localDate = date2.toLocalDate();
		System.out.println(localDate.getMonthValue());
		System.out.println(localDate.getDayOfWeek());
		//step4 local date to sql date
		
		java.sql.Date sqlDate = java.sql.Date.valueOf(localDate);
		System.out.println("SQL date 2: " +sqlDate);
		

	}

}
