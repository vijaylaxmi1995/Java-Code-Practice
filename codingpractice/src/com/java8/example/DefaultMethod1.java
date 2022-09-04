package com.java8.example;

public interface DefaultMethod1 {
	public void m1();
	public void m2();
	public default void m3() {
		System.out.println("inside default method");
	}
 
}
