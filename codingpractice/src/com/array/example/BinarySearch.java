package com.array.example;

public class BinarySearch {

public static void main(String[] args) {
	int[] arr= {1,3,5,7,9,8,2};
	int search =binarySearch(arr, 0);
	System.out.println(search);
	}

private static int binarySearch(int[] arr, int x) {
	int start=0;
	int end= arr.length-1;
	while(start<=end) {
		int mid=(start+end)/2;
		if(x==arr[mid]) {
			return mid;
		}
		else if(x>arr[mid]) {
			start=mid+1;
		}else {
			end=mid-1;
		}
	}
	return -1;
}

}
