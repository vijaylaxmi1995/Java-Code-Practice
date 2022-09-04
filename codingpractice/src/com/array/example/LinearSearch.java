package com.array.example;

public class LinearSearch {

	
		public static void main(String[] args) {
			int[] arr= {1,3,5,7,9,8};
			int search =linear(arr, 8);
			System.out.println(search);
		}
   

	private static int linear(int[] arr, int x) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) 
				return i;
		}
		return -1;
	}
	}


