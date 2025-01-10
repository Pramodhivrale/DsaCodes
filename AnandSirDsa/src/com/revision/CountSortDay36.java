package com.revision;

import java.util.Arrays;

// Count sort
public class CountSortDay36 {
	public static void main(String[] args) {
		int arr[] = { 9, 8, 7, 6, 5, 4, 3, 5, 7, 9, 1, 2, 2 };
		int count[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		int freq = 0;
		int element = 0;
		for (int i = 0; i < count.length; i++) {
			if (count[i] > freq) {
				freq = count[i];
				element = i;
			}
		}
		int index = 0;
		for (int i = 0; i < count.length; i++) {
			int x = count[i];
			for (int j = 1; j <= x; j++) {
               arr[index]=i;
               index++;
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}