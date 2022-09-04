package com.number.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOddNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the number");
Integer number = Integer.parseInt(br.readLine());
   if(number%2==0) { 
	   System.out.println(number+" = is even ");
   }
   else {
   System.out.println(number+" = is odd ");

	}

}
}
