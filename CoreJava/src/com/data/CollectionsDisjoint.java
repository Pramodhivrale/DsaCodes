package com.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDisjoint 
{
	  public static void main(String[] args) {
	        // Create two lists
	        List<String> list1 = new ArrayList<>();
	        list1.add("Apple");
	        list1.add("Banana");
	        list1.add("Cherry");

	        List<String> list2 = new ArrayList<>();
	        list2.add("Date");
	        list2.add("Elderberry");
	        list2.add("Fig");

	        // Check if the lists are disjoint
	        boolean disjoint = Collections.disjoint(list1, list2);
	        System.out.println("Are lists disjoint? " + disjoint); // Output: true

	        // Add an element common to both lists
	        list1.add("Fig");
	        disjoint = Collections.disjoint(list1, list2);
	        System.out.println("Are lists disjoint? " + disjoint); // Output: false
	    }

}
