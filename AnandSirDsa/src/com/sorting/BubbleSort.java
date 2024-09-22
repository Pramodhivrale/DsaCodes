package com.sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = { 1, 8, 5, 6, 9, 3, 4, 7 };

		for (int i = 0; i < arr.length - 1; i++) {
			boolean flag = true;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int c = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = c;
					flag = false;

				}
			}
			if (flag) {
				break;
			}
			System.out.println(Arrays.toString(arr));
		}

	}

}
