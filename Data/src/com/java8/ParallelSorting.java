package com.java8;

import java.util.Arrays;

public class ParallelSorting 
{
	void meth1()
	{
		int arr[]= {4,7,2,9,8,3};
		
		Arrays.parallelSort(arr,2,6);
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		new ParallelSorting().meth1();
	}

}
