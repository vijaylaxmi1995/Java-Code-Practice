package com.string.example;

import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SplitStringInDIfferentWays {

	public static void main(String[] args) {
    String str= "091-1234567890";
    String[] sarray= str.split("-");
    printString(sarray,"String split method");

    
    //2. second approach using Pattern class
   List<String> mylist =  Pattern.compile("-").splitAsStream(str).collect(Collectors.toList());
   System.out.println("Split the string by using Pattern class");	

   for(String string2: mylist) {
   System.out.println(string2);
   }    
    
   //3. 
     StringTokenizer stk= new StringTokenizer(str,"-");
     	while (stk.hasMoreTokens()) {
			 System.out.println(stk.nextToken());			
		}
	}

	private static void printString(String[] sarray, String approach) {
    System.out.println("Split the string by using: "+approach);	
    for(String string1: sarray) {
    	System.out.println(string1);
    }
	}
}
