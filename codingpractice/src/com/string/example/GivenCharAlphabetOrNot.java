package com.string.example;

import java.util.Scanner;

public class GivenCharAlphabetOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character");
		char ch= sc.next().charAt(0);
		
		if((ch>='a' && ch<='z')||(ch>='A'&& ch<='Z')) {
			System.out.println("it is an alphabet");
		}
		else {
		System.out.println("it is not an alphabet");
		}
	}

}
