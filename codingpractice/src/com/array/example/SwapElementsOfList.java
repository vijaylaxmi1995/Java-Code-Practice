package com.array.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapElementsOfList {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
	     list.add(1);
	     list.add(2);
	     list.add(3);
	     list.add(4);
	     System.out.println("List Before Swaping : " + list);
	     Collections.swap(list, 0, 3);

	     Collections.swap(list, 1, 2);
	     
	     System.out.println("List After Swaping : " + list);

	     
	}

}
