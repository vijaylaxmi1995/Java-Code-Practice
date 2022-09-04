package com.array.example;

import java.util.Scanner;

public class SumOfElementsInAnArray {

	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of Array");
    int n= sc.nextInt();
     int[] arr= new int[n];
     int sum=0;
    System.out.println("Enter the number of elements in an array ");
     for(int i=0;i<arr.length;i++) {
    	 arr[i]=sc.nextInt();
     }
    for(int i:arr) {
    	sum=sum+i;
    }
    System.out.println("Sum of elements in an array is: "+ sum);
    
    
	}

}
