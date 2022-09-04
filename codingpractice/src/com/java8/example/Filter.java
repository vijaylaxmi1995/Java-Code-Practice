package com.java8.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class Filter {

	public Filter() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
    Stream<String> str= Stream.of("abc", "nas","gas","cba");
    str.filter(str1->str1.endsWith("s")).forEach(System.out::println);
    
	}

}
