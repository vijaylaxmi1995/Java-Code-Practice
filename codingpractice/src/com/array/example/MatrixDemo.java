package com.array.example;

import java.util.Scanner;

public class MatrixDemo {

	
	//1. read the number of rows
	//2. read the number of columns
	//3. enter the elements for matrix
	//4. diplay the elements in the matrix
	
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r,c;
    System.out.println("enter the number of rows in matrix ");
    r=sc.nextInt();
    System.out.println("enter the number of columns in matrix ");
    c=sc.nextInt();
    int[][] matrix=new int[r][c];
    System.out.println("enter the number of elements to the matrix ");
    for(int i=0;i<r;i++) {
    	for(int j=0;j<c;j++) {
    		matrix[i][j]=sc.nextInt();
    	}
    }
    
    for(int i=0;i<r;i++) {
    	for(int j=0;j<c;j++) {
        System.out.print(matrix[i][j]+" ");    	
}
    	System.out.println(" ");
    }
    
	}

}
