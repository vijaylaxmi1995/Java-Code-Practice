package com.java8.example;

public class DefaultMethodImpl implements DefaultMethod1, DefaultMethodDemo2{

	public static void main(String[] args) {
    
	}

	@Override
	public void m1() {
		System.out.println("method m1() is called");
		
	}

	@Override
	public void m2() {
		System.out.println("method m2() is called");

	}

	@Override
	public void m3() {
		DefaultMethodDemo2.super.m3();
	}

}
