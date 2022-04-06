package com.drucare.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import org.omg.CORBA.Current;

public class DateTimeDemo {

	
	static void LocalDate()
	{
		//Current Date
		LocalDate date = LocalDate.now();
		System.out.println("Current Date is: "+date);
		
		//Current Time
		LocalTime time = LocalTime.now();
		System.out.println("\nCurrent Time is: "+time);
		
		//Current Date & Time
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("\nCurrent Date & Time is: "+ldt);
		
		//Formatted Date & Time
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy hh-mm-ss");
		String formattedDate = ldt.format(format);
		System.out.println("\nDate & Time format: "+formattedDate);
		
		//Month & days
		Month month =ldt.getMonth();
		int day =ldt.getDayOfMonth();
		int hour =ldt.getHour();
		int minutes =ldt.getMinute();
		int seconds = ldt.getSecond();
		
		System.out.println("\nMonth: "+month+" Day: "+day+" Hour: "+hour+" Minute: "+minutes+"seconds: "+seconds);
		
		LocalDateTime specificDate = ldt.withDayOfMonth(20).withYear(2020);
		System.out.println("\nSpecific Date & Time: "+ "current time "+specificDate);
				
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LocalDate();
	}

}
