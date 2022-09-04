package com.java8.example;

import java.util.ArrayList;

public class IterateArrayListUsingJava8 {

	public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("one");
    list.add("two");
    list.add("three");
    list.add("four");

		for(String s:list) {
			System.out.println(s);
		}
		
		System.out.println("using java 8");
	list.forEach(System.out::println);
		
		
	}

}
