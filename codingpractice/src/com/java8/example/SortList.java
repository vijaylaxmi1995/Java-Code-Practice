package com.java8.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

	public static void main(String[] args) {
    List<String> list= Arrays.asList("hi","hello","java","streams","apple");
    System.out.println("List before sort: " + list);
    List<String> sortedList= list.stream().sorted().collect(Collectors.toList());
    System.out.println("List after sort: " + sortedList);

    
    List<String> reverseList= list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    System.out.println("Reverse List: " + reverseList);
    
    

    
	}

}
