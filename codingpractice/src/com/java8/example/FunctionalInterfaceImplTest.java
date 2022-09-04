package com.java8.example;

public class FunctionalInterfaceImplTest {

	public static void main(String[] args) {
		FunctionalInterfaceDemo f=(int x)->x*x;
	     int result=f.multiplication(5);
	     System.out.println(result);
	}

}
