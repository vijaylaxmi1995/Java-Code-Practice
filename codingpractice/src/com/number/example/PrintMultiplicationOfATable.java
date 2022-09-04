package com.number.example;

import java.util.Scanner;

public class PrintMultiplicationOfATable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.println("enter the number to print multiplication table");
	    int n=scan.nextInt();
	    for(int i=1;i<=10;i++) {
	    	System.out.println(n+" * "+i+" = "+(n*i));
	    }
	}

}
