package com.number.example;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
     int r,sum=0 , temp;
     int num=454;
     temp=num;
     while(num>0) {
    	 r=num%10;
    	 sum=(sum*10)+r;
    	 num=num/10;
    	   }
     if(temp==sum) {
    	 System.out.println("Palindrom");
     }
     else {
    	 System.out.println("Not Palindrom");

     }
	
    String original,reverse="";
	Scanner in = new Scanner(System.in);   
    System.out.println("Enter a string/number to check if it is a palindrome");  
    original = in.nextLine();
    int length=original.length();
    for(int i=length-1;i>=0;i--) {
    	reverse=reverse+original.charAt(i);
    }
	
	if(original.equals(reverse)) {
	         System.out.println("Entered string/number is a palindrome.");
	}
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");   
	   }  
	}
