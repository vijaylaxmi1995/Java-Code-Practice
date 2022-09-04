package com.java8.example;

import java.util.HashMap;
import java.util.Map;

public class IterateHashMapUsingJava8 {


	public static void main(String[] args) {
     Map<String, Integer> map= new HashMap<>();
     map.put("one", 1);
     map.put("two", 2);
     map.put("three", 3);
     map.put("four", 4);
     
for(Map.Entry<String, Integer> entry: map.entrySet()) {
System.out.print(entry.getValue()+" ");
System.out.println(entry.getKey());
	}
map.forEach((k,v)->System.out.println("key = "+ k+ " value "+ v));
}
}