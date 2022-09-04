package com.string.example;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str="java";
		System.out.println(removeDuplicates(str));
		

	}

	private static String removeDuplicates(String str) {
		Set<Character> set = new HashSet<>();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			if(!set.contains(c)) {
				set.add(c);
				sb.append(c);
			}
		}
		
	   return sb.toString();
	}

}
//1. create a string
//2. write a method removeDuplicates
//3. in removeDuplicates , create hashset
//4. create StringBuffer 
//5. loop through the each character in the string
//6. take each character from array and check if present in hashset or not, if not present add to both HS and SB
//7. after iteration retuen the string

