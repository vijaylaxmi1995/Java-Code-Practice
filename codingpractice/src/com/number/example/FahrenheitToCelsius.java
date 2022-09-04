package com.number.example;

import java.util.Scanner;

public class FahrenheitToCelsius {

public static void main(String[] args) {
	float	temp;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the temparature to convert to celcius");
	temp= sc.nextFloat();
	temp=((temp-32)*5)/9;
	System.out.println("temp in celcius is: "+ temp);
  
	}

}
