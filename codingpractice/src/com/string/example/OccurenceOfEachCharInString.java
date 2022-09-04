package com.string.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OccurenceOfEachCharInString {

	public static void main(String[] args) {
		String str= "vijaylaxmi";
		occurenceOfEachCharInString(str);
	}

	private static void occurenceOfEachCharInString(String str) {
		Map<Character, Integer> map= new HashMap<>();
		char[] ch= str.toCharArray();
		
		for(char c:ch) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
				
			}
			else {
				map.put(c, map.get(c)+1);
			}
		}
		Set<Map.Entry<Character, Integer>> entryset=map.entrySet();
		for(Map.Entry<Character, Integer> entry:entryset) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	
	}

}
