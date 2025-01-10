package com.revision;

import java.util.HashMap;

// Use forEach form java 8 insted of for loop
public class HashMapFreruencyyDay35 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 4, 2, 1, 8, 9, 6, 7, 0 };
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

		for (int data:arr) {
			hashmap.put(data, hashmap.getOrDefault(data, 0)+1);
		}
		System.out.println(hashmap);

	}

}
