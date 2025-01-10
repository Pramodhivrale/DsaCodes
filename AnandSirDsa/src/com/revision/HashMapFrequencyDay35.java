package com.revision;

import java.util.HashMap;

public class HashMapFrequencyDay35 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 4, 2, 1, 8, 9, 6, 7, 0 };

		HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (freq.containsKey(arr[i])) {
				freq.put(arr[i], freq.get(arr[i]) + 1);
			} else {
				freq.put(arr[i], 1);
			}

		}
		System.out.println(freq);

	

	}
}
