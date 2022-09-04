package com.java8.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterUsingPredicateClass {

	public static void main(String[] args) {
	    List<Integer> list=Arrays.asList(1,2,4,6,7,9,3,5,8);
		
   Predicate<Integer> condition=new Predicate<Integer>() {

	@Override
	public boolean test(Integer t) {
		if(t%2==0) {
			return true;
		}
		return false;
	}
	   
   };
   
   list.stream().filter(condition).forEach(System.out::println);
	}

}
