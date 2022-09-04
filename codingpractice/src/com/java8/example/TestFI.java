package com.java8.example;

public interface TestFI {
	
	public void display();
	public void display1();
	
	public default void display2() {
		System.out.println("inside TestFI Default method");
	}

	
	public default void show() {
		System.out.println("inside TestFI Default method");
	}

}
