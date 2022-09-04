package com.array.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckArrayConteinsDuplicatesOrNot {

	public static void main(String[] args) {
    
		String[] duplicates= new String[]{"java","oracle","c","java"};
		List duplicateList=Arrays.asList(duplicates);
		Set duplicateSet = new HashSet<>(duplicateList);
		if(duplicateList.size()!=duplicateSet.size()) {
			System.out.println("The array conteins duplicates");
		}
		else {
			System.out.println("The array doesn't conteins duplicates");

		}
		
		
	}

}
