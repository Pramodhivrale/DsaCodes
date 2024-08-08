package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorEx 
{
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(8);
		al.add(5);
		al.add(9);
		al.add(1);
		al.add(4);
		al.add(3);
		
		System.out.println("Before sorting :"+al);
		Collections.sort(al,new NumberComparator());
		System.out.println("After sorting :"+al);
		
		
	}

}

class NumberComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		if(o1 > o2) {
			return 1;
		}
		else if (o1 < o2) {
			return -1;
		}
		return 0;
	}
	
}
