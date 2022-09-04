package com.java8.example;

import java.time.LocalDate;

public class StringToDateConverstion {

	public static void main(String[] args) {
    String date = "2022-08-26";
    LocalDate localdate=LocalDate.parse(date);
    System.out.println(localdate);
    System.out.println("Day of the Month " + localdate.getDayOfMonth());
    System.out.println("Day of the Year " + localdate.getDayOfYear());
    System.out.println("Day of the Week " + localdate.getDayOfWeek());


		
		
		
	}

}
