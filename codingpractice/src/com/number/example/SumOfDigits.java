package com.number.example;

public class SumOfDigits {

	public static void main(String[] args) {
     int num=5678;
     int sum=0, digit=0;
     
     while(num>0) {
    	 digit = num%10;
    	 sum= sum+digit;
    	 num=num/10;
     }
     
     System.out.println("sum of all digits = " + sum);
	}

}
