package com.practice;

import java.util.HashMap;

public class FrequencyUsingHashMapGetOrDefult {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 3, 4 };

		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

		for (int data : arr) {
			hashmap.put(data, hashmap.getOrDefault(data, 0) + 1);
		}
		
		hashmap.forEach((key,value)->System.out.println(key +" "+value));

	}
}
