package com.revision;

import java.util.HashMap;

//pairs of tow numbers which sum=k
public class pairsOfSumDay43 {
	public static void main(String[] args) {
		int arr[] = { 3, 10, -4, 15, -9, 20, 12, 25 };
		int k = 16; // Change this to any desired value of k

		findPairsWithSum(arr, k);

	}

	private static void findPairsWithSum(int[] arr, int k) {
		HashMap<Integer, Integer> pairs = new HashMap<Integer, Integer>();

		for (int num : arr) {
             int complement=k-num;
             if(pairs.containsKey(complement)) {
            	 System.out.println("(" + complement + ", " + num + ")");
             }
             pairs.put(num, 1);
		}
	}

}
