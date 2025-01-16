package com.dsa;

import java.util.HashSet;

public class CommanElementInTwoArray {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 4, 5, 6 };
		int[] arr2 = { 4, 5, 7, 8, 9 };

		findCommanElement(arr1, arr2);

	}

	private static void findCommanElement(int[] arr1, int[] arr2) {
HashSet<Integer> hashset=new HashSet<Integer>();
		
		for(int num:arr1) {
			hashset.add(num);
		}
		
        for(int num1:arr2) {
        	if(hashset.contains(num1)) {
        		System.out.println(num1);
        	}
        }
	}

}
