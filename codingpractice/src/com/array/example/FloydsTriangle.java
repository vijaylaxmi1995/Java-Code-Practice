package com.array.example;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		int n,r,c,num=1;
		 Scanner sc = new Scanner(System.in);
		    System.out.println("enter number of rows");
		     n= sc.nextInt();                         //4
		     System.out.println("Floyds Triangle");
		     for( r=1;r<=n;r++) {                     //1<4, 2<4
		    	 
		    	 for(c=1;c<=r;c++) {                  //1==1, 2<=1(1<=2,2==2,3<=2) (
		    		 System.out.print(num+ " ");      //1 
		    		 num++;                           //2
		    	 }
			     System.out.println(" ");             //next line

		     }
		    
	}

}
