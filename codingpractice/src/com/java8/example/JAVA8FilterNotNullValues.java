package com.java8.example;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class JAVA8FilterNotNullValues {

	public static void main(String[] args) {
    List<String> list= Arrays.asList("hello","world",null,"vj",null);
    System.out.println(list);
    //Method 1
    List<String> result= list.stream().filter(str->str!=null).collect(Collectors.toList());
    System.out.println(result);
    
    //method 2
    List<String> notNull=list.stream().filter(Objects::nonNull).collect(Collectors.toList());
    System.out.println(notNull);

    //method 3
    List<String> map=list.stream().map(s->s).filter(s->s!=null).collect(Collectors.toList());
    System.out.println( map);

    
    
	}

}
