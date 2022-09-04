package com.number.example;

import java.util.Scanner;

public class DisplayStarPattern {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.println("enter the row size");
	    int r=scan.nextInt();

	   System.out.println("enter the column size");
       int c=scan.nextInt();
       
       for(int i=1;i<=r;i++) {
    	   for(int j=1;j<=c;j++) {
    		   System.out.print("*"+" ");
    	   }
    	   System.out.println(" ");
       }
       
}
}