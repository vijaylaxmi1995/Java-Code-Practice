package com.array.example;

public class ReverseArray {

	public static void main(String[] args) {
     int[] arr= {12,13,23,45,67,54,78};
     int low=0,high=arr.length-1;
     
     while(low<high) {
    		 int temp=arr[low];
    		 arr[low]=arr[high];
    		 arr[high]=temp;
    		 low++;
    		 high--;
    	 
    	
     }
		
     for(int i:arr) {
		 System.out.print(i+ " ");
	 }	
		
		
	}

}
