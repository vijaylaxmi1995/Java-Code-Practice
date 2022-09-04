package com.array.example;

import java.util.Arrays;

public class SortCharactersOfString {

	public static void main(String[] args) {
    String str= "java for tech";
    char[] ch=str.toCharArray();
        Arrays.sort(ch);
        String sortedString= new String(ch);

 System.out.println(sortedString);

}
}