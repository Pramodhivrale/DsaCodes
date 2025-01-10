package com.revision;

import java.util.Arrays;

public class InsertionSortDay34 {
	public static void main(String[] args) {
		int arr[] = { 2, 8, 5, 96, 4, -1, 11 };

		for (int i = 0; i < arr.length; i++) {
			int current = arr[i];
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (current < arr[j]) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}
			}
			arr[j + 1] = current;

		}
		System.out.println(Arrays.toString(arr));
	}
}
