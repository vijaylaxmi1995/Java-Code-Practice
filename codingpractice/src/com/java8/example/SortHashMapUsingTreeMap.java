package com.java8.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortHashMapUsingTreeMap {

	public static void main(String[] args) {
     Map<String,String> unsortedMap= new HashMap<>();
     unsortedMap.put("apple", "apple");
     unsortedMap.put("pineapple", "pineapple");
     unsortedMap.put("banana", "banana");
     unsortedMap.put("guava", "guava");

     Set<Map.Entry<String,String>> entryset1=unsortedMap.entrySet();
     for(Map.Entry<String, String> entry:entryset1) {
    	 System.out.println("unsorted value are :"+ entry.getKey());
     }
     System.out.println("====================");
     Map<String,String> treemap= new TreeMap<String,String>(unsortedMap);
     Set<Map.Entry<String,String>> entryset2=treemap.entrySet();

     for(Map.Entry<String, String> entry:entryset2) {
    	 System.out.println("sorted values are:"+ entry.getKey());
     }
     
	}

}
