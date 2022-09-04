package com.array.example;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayAsc_DescDemo {

	public static void main(String[] args) {
    String[] sarray= {"one","two","three","four","five"};
    
    System.out.println("before sorting the array :");
    for(String string: sarray) {
    	System.out.println(string);
    }
     Arrays.sort(sarray);
    System.out.println("=======================");
    System.out.println("after sorting the array :");
    for(String string: sarray) {
    	System.out.println(string);
    	}
    Arrays.sort(sarray, Collections.reverseOrder());
    System.out.println("=======================");
    System.out.println("sorting elements in  descending order :");
    for(String string: sarray) {
    System.out.println(string);
    }
 }
}
