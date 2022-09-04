package com.java8.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatDemo {

	public static void main(String[] args) {
	LocalDateTime datetime=LocalDateTime.now();
    System.out.println("Before:"+ datetime);
    DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    System.out.println(datetime.format(formatter));
	}

}
