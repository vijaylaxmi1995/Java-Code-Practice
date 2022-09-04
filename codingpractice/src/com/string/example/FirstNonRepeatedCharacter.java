package com.string.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
    String str= "aabbddef";
    char c= getFirstNonRepeatedCharacter(str);
    System.out.println("first non-repeated character is: "+c);
	}

	private static char getFirstNonRepeatedCharacter(String str) {
		Map<Character, Integer> map= new LinkedHashMap<>();
		for(char ch: str.toCharArray()) {
			map.put(ch, map.containsKey(ch)?map.get(ch)+1:1);
			
		}
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();

		}
		
	}
		throw new RuntimeException("didn't found  any non repeatedcharacter");
	}
}
