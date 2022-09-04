package com.java8.example;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FIlterMapByKey {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "apple");
		map.put(2, "pineapple");
		map.put(3, "banana");
		map.put(4, "guava");
		
		System.out.println(map);
		
		Map<Integer,String> Imap= map.entrySet().stream().filter(map1->map1.getKey().intValue()>=2)
		.collect(Collectors.toMap(map1->map1.getKey(), map1->map1.getValue()));
		
		System.out.println(Imap);
	}

}
