package com.array.example;

import java.util.Arrays;

public class FindMissingNumberInAnArray {

	public static void main(String[] args) {
   
	int[] array= {1,2,3,4,6};
	int missingNum= getMissingNumber(array,6);
		System.out.printf("Missing number in an array %s is %d %n",Arrays.toString(array) ,missingNum);
	}

	private static int getMissingNumber(int[] array, int n) {
	    int actualSum=0;
		int expectedSum=(n*(n+1)/2);
		for(int i:array) {
			actualSum=actualSum+i;
		}
		return expectedSum-actualSum;
		
	}

}
