package com.java8.example;

import java.sql.Timestamp;
import java.util.Date;

public class CurrentTimeStamp {

	public static void main(String[] args) {
		Timestamp timeStamp= new Timestamp(System.currentTimeMillis());
		System.out.println(timeStamp);
		
		
		//2nd way
		Date date= new Date();
		System.out.println(new Timestamp(date.getDate()));
				

	}

}
