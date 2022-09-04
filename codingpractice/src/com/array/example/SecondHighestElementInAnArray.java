package com.array.example;

import java.util.Arrays;

public class SecondHighestElementInAnArray {

	public static void main(String[] args) {
      int[] array= {1,20,5,6,16,10};
      Arrays.sort(array);
      System.out.println("First highest element in an array is: "+ array[array.length-1]);

      System.out.println("Second highest element in an array is: "+ array[array.length-2]);
		
      System.out.println("Third highest element in an array is: "+ array[array.length-3]);

		
		
		
	}

}
