package com.number.example;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to be reversed");
		int num=sc.nextInt();
		String str=String.valueOf(num);
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
			
		}
		int num1=Integer.valueOf(reverse);
		System.out.println("Reversed number is: " +num1 );

	}

}
