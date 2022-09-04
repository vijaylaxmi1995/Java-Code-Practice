package com.number.example;

import java.util.Scanner;

public class LargestNumberDemo {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the first number");
    int num1=scan.nextInt();
    
	System.out.println("enter the second number");
	int num2=scan.nextInt();
	    
		
    System.out.println("enter the third number");
    int num3=scan.nextInt();
    
    if((num1>num2) && (num1>num3))
    {
    	System.out.println("First number is the largest");
    }
    else if((num2>num3) && (num2>num1))
    {
    	System.out.println("Second number is the largest");
    }
    else if((num3>num1) && (num3>num2))
    {
    	System.out.println("Third number is the largest");
    }

    else {
    	System.out.println("None of the numbers are greater");
    }
}

}
