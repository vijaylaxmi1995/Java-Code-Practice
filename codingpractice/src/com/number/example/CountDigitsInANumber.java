package com.number.example;

public class CountDigitsInANumber {
    public static void main(String[] args) {
    int num=12345;
    
    //Iterative Approach
   /* int count=0;
    while(num>0) {
    	num=num/10;
    	count++;
    }
	System.out.println("count of digits in a number is "+ count);*/
	System.out.println(countDigits(num));
}
	//Recursive Approach
	public static int countDigits(Integer n) {
		if(n==0) {
		return 0;
		}
		else {
			return 1+countDigits(n/10);
		}
	}
}
