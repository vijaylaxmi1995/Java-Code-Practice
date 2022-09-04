package com.number.example;

import java.util.Scanner;

public class EvenOddWithoutModuloOperator {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
    int result=(num/2)*2;
		if(result==num) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd ");

		}
	}

}
