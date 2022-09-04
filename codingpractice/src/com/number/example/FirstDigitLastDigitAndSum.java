package com.number.example;

import java.util.Scanner;

public class FirstDigitLastDigitAndSum {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the number");
    int num=scan.nextInt();
    
    int lastDigit=num%10;
    
    int firstDigit = num;

    while(firstDigit>10) {
    	firstDigit=firstDigit/10;
    }
    System.out.println("firstDigit = "+firstDigit);
    System.out.println("lastDigit = "+lastDigit);    
    System.out.println("sum = " + (firstDigit+lastDigit));

    

    
    
    
    
     
	}

}
