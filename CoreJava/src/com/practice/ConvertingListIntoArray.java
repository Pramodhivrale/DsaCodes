package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConvertingListIntoArray 
{
	public static void main(String[] args) {
		 List<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");

	        // Convert List to Object[] array
	        Object[] array = list.toArray();
        	        
	        List<String> nCopies = Collections.nCopies(5, "Java");
	        System.out.println(nCopies);
	}

}
