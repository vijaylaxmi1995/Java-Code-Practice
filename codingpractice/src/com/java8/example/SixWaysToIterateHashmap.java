package com.java8.example;

import java.util.HashMap;
import java.util.Map;

public class SixWaysToIterateHashmap {

	public static void main(String[] args) {

		 
		Map<Integer, String> fruitmap= new HashMap<>();
		fruitmap.put(1, "mango");
		fruitmap.put(2, "apple");
		fruitmap.put(3, "banana");
		fruitmap.put(4, "pineapple");

		//1. using Keyset
         keysetIteration(fruitmap);
     }
   private static void keysetIteration(Map<Integer, String> fruitmap) {
		for(Integer fruitId :fruitmap.keySet()) {
			System.out.println("key value =" + fruitId);	
		}
	}

}
