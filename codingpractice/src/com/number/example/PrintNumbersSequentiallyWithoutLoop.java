package com.number.example;

public class PrintNumbersSequentiallyWithoutLoop {

	public static void main(String[] args) {
     printNumbers(1);
		}

	private static void printNumbers(int i) {
     		if(i<=20) {
     			System.out.println(i);
     			printNumbers(i+1);
     		}
	}

}
