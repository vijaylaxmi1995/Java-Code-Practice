package com.java8.example;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FIlterMapByValue {

	public static void main(String[] args) {

		Map<Integer,String> map=new HashMap<>();
		map.put(1, "apple");
		map.put(2, "pineapple");
		map.put(3, "banana");
		map.put(4, "guava");
		
		System.out.println(map);
		
		Map<Integer,String> Ymap=map.entrySet().stream().filter(map1->map1.getValue().equals("banana"))
				.collect(Collectors.toMap(map1->map1.getKey(), map1->map1.getValue()));
		System.out.println(Ymap);
		
		Map<Integer,String> Ymap1=map.entrySet().stream().filter(map1->map1.getValue().equals("abcd"))
				.collect(Collectors.toMap(map1->map1.getKey(), map1->map1.getValue()));
		System.out.println(Ymap1);
		
		Map<Integer,String> Ymap2=map.entrySet().stream().filter(map1->"guava".equals(map1.getValue()))
				.collect(Collectors.toMap(map1->map1.getKey(), map1->map1.getValue()));
		System.out.println(Ymap2);
		
		
		
		
		
		
		
		

	}

}
