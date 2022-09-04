package com.java8.example;


//Runnable interface is a functional interface
public class RunMethodImplUsingLambdaExpression {

	public static void main(String[] args) {

		new  Thread(()->
		{
			System.out.println("New Thread Created");
		}
      ).start();
		
		
	}

}
