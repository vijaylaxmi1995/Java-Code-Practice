package com.string.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrintDuplicateWordsInAnArray {

	public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the array size");
      int n= scan.nextInt();
      
      String[] sarr= new String[n];
      System.out.println("Enter the number of elements to store");
      for(int i=0;i<n;i++) {
    	 sarr[i]= scan.next();
      }
      System.out.println("String array elements are: ");  
   for (String s:sarr)   
   {  
   System.out.println(s);  
   }  
	
   Set nonDuplicateSet= new HashSet<>();
   Set duplicateSet= new HashSet<>();
   
   for(String string :sarr) {
	   if(!nonDuplicateSet.contains(string)) {
		   nonDuplicateSet.add(string);
	   }
	   else {
		   duplicateSet.add(string);
		   
	   }
   }
   System.out.println("Duplicate Element is: " + duplicateSet);
  	}
	}
