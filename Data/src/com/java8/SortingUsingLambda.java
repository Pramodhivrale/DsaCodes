package com.java8;

import java.util.ArrayList;
import java.util.Collections;

public class SortingUsingLambda {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(8);
		al.add(5);
		al.add(9);
		al.add(1);
		al.add(4);
		al.add(3);

		System.out.println("Before sorting :" + al);
		
		//Collections.sort(al, (i,j)->i.compareTo(j));
		// This will sort in ascending order
		Collections.sort(al,(i , j) -> (i > j) ? -1: 1);
		// This will sort in descending order
		System.out.println(al);
		
		
		
		
		//System.out.println("After sorting :" + al);

	}

}


