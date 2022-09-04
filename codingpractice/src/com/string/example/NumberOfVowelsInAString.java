package com.string.example;

import java.util.Scanner;

public class NumberOfVowelsInAString {

	public static void main(String[] args) { 
   Scanner sc = new Scanner(System.in);
    System.out.println("enter a string");
    String str= sc.next();
    char[] ch= str.toCharArray();
	int count=0;

    for(char c:ch) {
    	switch(c) {
    	case 'a':
    	case 'e':
    	case 'i':
    	case 'o':		
    	case 'u':
    		count++;
    	break;
    	}
    	
    }
    System.out.println("Number of vowels in a given string are: "+ count);
	}

}
