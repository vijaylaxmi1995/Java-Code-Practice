package com.number.example;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		
		
		boolean prime=true;
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter the number to check prime or not");
	     int num=sc.nextInt();
	     for(int i=2;i<num;i++) {
	    	 if(num%i==0) {
	    		 prime=false;
	    		 break; 
	    	 }
	 }
	     if(prime==true) {
	     System.out.println("given number is prime number");
	}
	     else {
		     System.out.println("given number is not a prime number");
 
	     }
	}

}
