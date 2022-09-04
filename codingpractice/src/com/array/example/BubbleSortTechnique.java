package com.array.example;


//elements are sorted in asc or desc order by comparing two adjecent elements and place them based on asc or desc
//if we have 'n' elements then this sorting technique requires 'n-1' passes(iteration) to sort
public class BubbleSortTechnique {

	public static void main(String[] args) {
		int[] arr= {9,8,7,5,6};
		System.out.println("Array before sorting");
		for(int a:arr) {
			System.out.println(a);
		}
        bubbleSort(arr);
		System.out.println("Array after sorting");
		for(int a:arr) {
			System.out.println(a);
		}
	}
private static void bubbleSort(int[] arr) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<(arr.length)-i;j++) {
				if(arr[j]<arr[j-1]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
							
				}
				
				
			}
		}
		
		
		
		
		
	}

}
