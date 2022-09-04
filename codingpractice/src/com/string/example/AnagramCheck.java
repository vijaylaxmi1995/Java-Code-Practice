package com.string.example;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		String s1="java";
		String s2="java";
		
		System.out.println("Both Strings are anagrams : " + anagramCheck(s1,s2));
		 }
private static boolean anagramCheck(String s1, String s2) {
		char[] ch1=s1.toCharArray();
		StringBuffer sb = new StringBuffer(s2);
		for(char c:ch1) {
			int index= sb.indexOf(String.valueOf(c));
			if(index!=-1) {
				sb.deleteCharAt(index);
			}
			else {
				return false;
			}
	

}
		return sb.length()==0;						

}
}