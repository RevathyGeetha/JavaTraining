package com.example;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dateOfBirth = "2000-10-11";
		Student rev = new Student();
		rev.setRollnumber(200);
		rev.setStudentName("rev");
		rev.setDateOfBirth(LocalDate.parse(dateOfBirth));
		rev.setDateOfJoining(LocalDateTime.now());
		
		System.out.println("year:"+rev.getDateOfBirth());
		System.out.println("day :"+rev.getDateOfBirth().getDayOfMonth());
		System.out.println("month:"+rev.getDateOfBirth().getMonth());
		
		
		LocalTime startTime = LocalTime.of(9, 30);
		
		LocalTime endTime = startTime.plus(8, ChronoUnit.HOURS);
		System.out.println("end time: " +endTime);
		System.out.println("start time : "+startTime);

	}

}