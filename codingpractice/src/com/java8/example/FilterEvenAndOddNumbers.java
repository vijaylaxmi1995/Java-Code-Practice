package com.java8.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Stream filter(Predicate<? super T> Predicate)
public class FilterEvenAndOddNumbers {

	public static void main(String[] args) {
    List<Integer> list=Arrays.asList(1,2,4,6,7,9,3,5,7,8);
    
    //EvenNumbers
    list.stream().filter(num->num%2==0).forEach(System.out::println);
    
    System.out.println("=========================");
    //oddNumbers
    list.stream().filter(num->num%2!=0 && num>5).collect(Collectors.toSet()).forEach(System.out::println);
	}

}
 
/*
 * Stream Filter: it accepts the predicate as input and returns stream of
 * elements, so when we apply filter on a stream it returns a stream that matches
 * the predicate it is an intermediate operation and is lazy.(intermediate
 * operations are always lazy) if we apply filter method directly it won't do
 * filtering rather creates a new stream. when we traverse that stream ,
 * filtering will happen
 */


