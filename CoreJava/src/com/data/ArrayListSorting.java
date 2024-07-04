package com.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSorting
{
	void meth1()
	{
		ArrayList<Integer> arr= new ArrayList<Integer>();
		arr.add(100);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		
		System.out.println("before sort" +arr);
		Collections.sort(arr,new compare());
		
		//System.out.println("After sorting :"+arr+" ");
		
		Collections.sort(arr,(i,j)-> i.compareTo(j));
		System.out.println("After sorting :"+arr+" ");
		
        
		
	}
	public static void main(String[] args) 
	{
		new ArrayListSorting().meth1();
		
	}

}

class compare implements Comparator<Integer>{

	@Override
	public int compare(Integer i, Integer j) {
		
		if(i > j)
		{
			return -1;
		}
		else if (i < j) {
			return 1;
		}else {
			return 0;
		}
	}
	
}









