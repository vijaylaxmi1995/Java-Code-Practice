package com.string.example;

import java.util.Arrays;

public class TwoStringsAnagramOrNot {

	public static void main(String[] args) {
		String s1="java";
		String s2="java";
		
		System.out.println("Both Strings are anagrams : " + anagramCheck(s1,s2));
		

	}
private static boolean anagramCheck(String s1, String s2) {
		char[] charArrayFromString1=s1.toCharArray();
		char[] charArrayFromString2=s2.toCharArray();
		
		Arrays.sort(charArrayFromString1);
		Arrays.sort(charArrayFromString2);

      return Arrays.equals(charArrayFromString1, charArrayFromString2);
				
	}

}
//two strings are anagram if they contain same characters but in different order