package com.revision;

import java.util.Arrays;

// We just need to find complement in the array if we found complement then we have our pair
public class PairsOfSumUsing_BS_Day43 {

	public static void main(String[] args) {
		int arr[] = { 3, 10, -4, 15, -9, 20, 12, 25 };
		int key = 16;

		findpairs(arr, key);
	}

	private static void findpairs(int[] arr, int key) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int complement = key - arr[i];
			if (binarySearch(arr, complement, i + 1, arr.length - 1)) {
				System.out.println(arr[i] + " " + complement);
			}
		}

	}

	private static boolean binarySearch(int[] arr, int complement, int low, int high) {
		while(low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == complement) {
				return true;
			}
			if (arr[mid] > complement) {
				high = mid - 1;
			} else if (arr[mid] < complement) {
				low = mid + 1;
			}
		}
		return false;
	}
}