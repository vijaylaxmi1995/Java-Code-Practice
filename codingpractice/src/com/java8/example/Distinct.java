package com.java8.example;

import java.util.Arrays;
import java.util.List;

public class Distinct {

 public static void main(String[] args) {
List<Integer> list=Arrays.asList(10,13,12,12,13,18);
list.stream().distinct().forEach(System.out::println);



	}

}
