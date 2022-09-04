package com.number.example;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 3 numbers");		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		if(a>b && a>c) {
			System.out.println(a +" is largest");
		}
		
		if(b>a && b>c) {
			System.out.println(b +" is largest");
		}
		
		if(c>b && c>a) {
			System.out.println(c +" is largest");
		}
		
}
}