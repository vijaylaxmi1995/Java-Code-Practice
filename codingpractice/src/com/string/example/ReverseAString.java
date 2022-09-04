package com.string.example;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {

		String input, reverse="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		input=sc.nextLine();

		for(int i=input.length()-1;i>=0;i--) {
			reverse=reverse+input.charAt(i);
		}
		
		System.out.println("Reverse String is: "+ reverse);
	}

}
