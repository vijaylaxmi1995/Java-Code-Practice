package com.java8.example;

import java.util.*;

public class ForEachClassDemo {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(1, "Shrikar");
		map.put(2, "Vijaylaxmi");
		map.put(3, "Vaishnavi");
		map.put(4, "sneha");
for(Map.Entry<Integer, String> entry:map.entrySet()) {
			System.out.print("key = " + entry.getKey()+" ");
			System.out.println("value = " + entry.getValue());
	}
		System.out.println("Using java 8");
		//Using java 8
		map.forEach((k,v)->System.out.println("key = " +k + " value = "+ v));
	}
}
