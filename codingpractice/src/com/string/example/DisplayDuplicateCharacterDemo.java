package com.string.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DisplayDuplicateCharacterDemo {

	public static void main(String[] args) {
		String str= "vijaylaxmi";
		displayDuplicateCharacterOccurrence(str);
		
	}

	private static void displayDuplicateCharacterOccurrence(String str) {
		
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
			Set<Map.Entry<Character, Integer>> entryset= map.entrySet();
			for(Map.Entry<Character, Integer> entry: entryset) {
				if(entry.getValue()>1) {
					System.out.println(entry.getKey()+" "+ entry.getValue());
				}
			}
			
		}	
		
	}

//1. create a string
//2. write a method displayDuplicates which accepts String
//3. in removeDuplicates , create HashMap with character as key and occurrences as value
//4. convert string to char array
//5. loop through the each character in the array
//6. take each character from array and check for key in hashmap if charcter is not present in h ashmap
     //add to hashmap with character as key and 1 as value.
//7. if already present in hashmap add key as character  and increment the count
//8. loop through the each character in the map and print only those value with occurrence greater than 1.


