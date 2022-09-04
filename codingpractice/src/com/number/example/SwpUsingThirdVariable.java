package com.number.example;

public class SwpUsingThirdVariable {

	public static void main(String[] args) {
    int a=10,b=20;
    System.out.println("Elements Before swap ;" + a+ " " +b);
    swap(a,b);
   
    
}

   public static void swap(int a, int b) {
    	int temp=a;
        a=b;
        b=temp;
        
        System.out.println("Elements After swap ;" + a+ " " +b);
	}

}
