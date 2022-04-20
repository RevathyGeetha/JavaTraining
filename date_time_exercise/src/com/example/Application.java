package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram = new Student(101, "rev", LocalDate.of(2001, 10, 11), 
				LocalDateTime.of(2021,  Month.OCTOBER, 10,3, 15));
		Student geetha = new Student(102, "geetha", LocalDate.now(), 
				LocalDateTime.now());
		System.out.println("ram year of birth : "+ram.getDateOfBirth().getYear());
		System.out.println("geetha yaer of birth : "+geetha.getDateOfBirth().getYear());
		System.out.println("rams firstBirthdaay : "+ram.getDateOfBirth().plus(1,ChronoUnit.YEARS));
		System.out.println("RAM 60 TH BIRTHDAY : "+ram.getDateOfBirth().plus(60, ChronoUnit.MONTHS));
		System.out.println("ram previous year : "+ram.getDateOfBirth().minus(10, ChronoUnit.DAYS));
		System.out.println("ram birthday timing : "+ram.getDateOfJoining().getHour());
		
		
		


	}

}
