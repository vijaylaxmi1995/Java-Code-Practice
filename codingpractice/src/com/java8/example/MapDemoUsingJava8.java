package com.java8.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemoUsingJava8 {

	public static void main(String[] args) {
    List<String> list=Arrays.asList("Vijaya","Shiva","chichkote");
    System.out.println(list);
    
    //before java 8
    List<String> upper= new ArrayList<>();
    for(String s: list) {
    	upper.add(s.toUpperCase());
    	
    }
   System.out.println(upper);
    
   //after java 8
   List<String> collect= list.stream().map(String::toUpperCase).collect(Collectors.toList());
   System.out.println(collect);
   
   System.out.println("====================using object==================================");
   List<Student> studentslist=Arrays.asList(new Student("Sandeep",1),new Student("krishna",2),new Student("rama",3));
   
   //before java 8
   List<Student> names=new ArrayList<>();
   for(Student stu:studentslist) {
	 //names.add(stu.getSname());
   }
  System.out.println("Student names: "+ names);
		   
  //After java 8
  List<String> snames =studentslist.stream().map(x->x.getSname()).collect(Collectors.toList());
 System.out.println(snames);
		   
		   
		   
	}

}
