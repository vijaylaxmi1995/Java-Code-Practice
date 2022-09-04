package com.number.example;

public class FibonacciSeriesOfANumber {

	public static void main(String[] args) {
     int max=10;
     int n1=0,n2=1,sum;
     for(int i=0;i<max;i++) {
    	 System.out.print(n1+" ");
         sum=n1+n2;
    	 n1=n2;
    	 n2=sum;
     }
	}

}
