package com.java8.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class PrintCurrentDateAndTime {

	public static void main(String[] args) {
DateFormat sdf= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
Date date = new Date();
System.out.println(sdf.format(date));

System.out.println("Using jaba 8 features");

DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
LocalDateTime now= LocalDateTime.now();
System.out.println(dtf.format(now));
//System.out.println(now.format(dtf));


	}

}
 