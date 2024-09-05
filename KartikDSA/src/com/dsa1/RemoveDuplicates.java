package com.dsa1;

import java.util.Iterator;
import java.util.TreeSet;

public class RemoveDuplicates 
{
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,10,20};
		
		
		TreeSet<Integer> tr=new TreeSet<Integer>();
		for(int num:arr) {
			tr.add(num);
		}
		
		Iterator<Integer> iterator = tr.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
	}

}
