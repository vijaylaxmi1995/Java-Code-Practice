package com.array.example;

import java.util.Scanner;

public class InsertionAtSpecificPosition {

	public static void main(String[] args) {
		int[] arr= new int[6];
		Scanner scan= new Scanner(System.in);
		for(int i=0;i<arr.length-1;i++) {
		 arr[i]= scan.nextInt();
	}
		System.out.println("printing the elements before insertion");
		for(int i:arr) {
			System.out.println(i);
		}
       System.out.println("Enter the location at which you want to insert");
       int location=scan.nextInt();       
       System.out.println("Enter the value at which you want to insert");
       int value=scan.nextInt();    
       
       for(int i=arr.length-1; i>location;i--) {
    	   arr[i]=arr[i-1];
       }
      arr[location]=value;

      System.out.println("printing the elements after insertion");
		for(int i:arr) {
			System.out.println(i);
		}
}
}