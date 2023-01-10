package com.example.demo.point.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		LocalDate date1 = LocalDate.of(2017, 1, 13);
		System.out.println("Today date: " + date1);

		LocalTime time = LocalTime.of(10, 43, 12);
		System.out.println(time);  
		
		LocalDateTime datetime1 = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatDateTime = datetime1.format(format);
		System.out.println(formatDateTime);
		
		
	}
}
