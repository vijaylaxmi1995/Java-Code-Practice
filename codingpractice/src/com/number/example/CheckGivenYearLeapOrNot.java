package com.number.example;

import java.util.Scanner;

public class CheckGivenYearLeapOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year");
		int year = sc.nextInt();
		
		if(year%4==0) {
			System.out.println("year is leap year");
		}
		else {
			System.out.println(year+  " :is not a leap year");

		}
	}

}
