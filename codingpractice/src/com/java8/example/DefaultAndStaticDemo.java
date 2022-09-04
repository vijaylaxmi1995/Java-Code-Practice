package com.java8.example;
/*
Default methods:
	 >>it helps us implementing the interfaces without having the fear of  breaking the implementation classes	 
     >> we can overcome diamond shape problem using default method
     >> it helps us to avoid utility classes like collections class method
     >> one of the major reason to use default method is to enhance the  collection interface api in java 8
        to support lambda expressions as well as other methods.
        
  */

public class DefaultAndStaticDemo implements TestFI ,TestFI1{

	@Override
	public void display() {
		
	}

	@Override
	public void display1() {
		
	}

	@Override
	public void show() {
		TestFI1.super.show();
	System.out.println("Inside implementation default metho");
	}

	//calling  interface default method
	public static void main(String[] args) {
   TestFI test= new DefaultAndStaticDemo();
   	test.display2(); 
   	
   	TestFI1 test1= new DefaultAndStaticDemo();
   	test1.show();
   	
   }
	

}

/*
 * abstract methods: >>must and should be implemented in subclasses >>modifies
 * the subclass structure as and when new abstract methods added to interface
 * default methods: >>default methods won't modify the implementation class
 * structure as they are implemented in interface itself >> default methods
 * won't except any implementation in implementation class >>to call default
 * methods  of an interface we just need to create an object of implemntation class with
 * interface reference
 * 
 * 
 * 
 */

/*
 * //multiple inheritence is not allowed in java directly, but indirectly
 * allowed using inheritecnce TestFT-> default show() TestFI1->default show()
 * 
 * DefaultAndStaticDemo implemants TestFI,TestFI1{
 * 
 * TestFI1 test= new DefaultAndStaticDemo() test.show();
 * 
 * 
 * }
 */





