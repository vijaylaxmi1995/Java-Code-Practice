package com.array.example;

public class PrintElementAtEvenPosition {

	public static void main(String[] args) {
     int[] arr= {1,2,3,4,5,6,7,8,9};
     for(int i=0;i<arr.length;i=i+2) {
    	 System.out.println("Even position values: ");
     System.out.println("Index= "+ i +" and value is: "+arr[i]);
     }
     System.out.println("===================================");
     for(int i=1;i<arr.length;i=i+2) {
    	 System.out.println("Odd position values: ");
         System.out.println("Index= "+ i +" and value is: "+arr[i]);
         }
     
	}
	
}
