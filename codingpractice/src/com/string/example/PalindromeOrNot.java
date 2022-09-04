package com.string.example;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    System.out.println("enter a string");
		    String originalString= sc.next();
		    String reverseString="";
		    
		    for(int i=originalString.length()-1;i>=0;i--) {
		    	reverseString=reverseString+originalString.charAt(i);
		    }
if(reverseString.equals(originalString)) {
	System.out.println("given String is palindrome");
}else {
	System.out.println("given String is not palindrome");

}
	}

}
