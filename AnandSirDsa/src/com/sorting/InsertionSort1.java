package com.sorting;

import java.util.Arrays;

public class InsertionSort1 {
	public static void main(String[] args) {
		int arr[] = { 2, 8, 5, 96, 4, -1, 11 };

		int size = arr.length;

		sort(arr, size);
		System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] arr, int size) {
		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j=i-1;
			while (j >= 0 && current < arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
		
	}

}
