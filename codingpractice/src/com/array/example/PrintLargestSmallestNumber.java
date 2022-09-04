package com.array.example;

import java.util.Scanner;

public class PrintLargestSmallestNumber {

	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the size of an array");

    int n= sc.nextInt();
    int[] arr = new int[n];
    System.out.println("enter the elements to an array");
    for(int i=0;i<n;i++)
    arr[i]= sc.nextInt();
    
    int smallest= Integer.MAX_VALUE;
    int largest= Integer.MIN_VALUE;
    
    for(int num:arr) {
    	if(num<smallest)
    		smallest=num;
    }
    System.out.println("smallest number is:"+ smallest);
    
    for(int num:arr) {
    	if(num>largest)
    		largest=num;
    }
    System.out.println("largest number is:"+ largest);
    
 }
}
