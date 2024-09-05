package com.dsa1;

import java.util.Arrays;

public class SumOFThreePairs {
	public static void main(String[] args) {
		int arr[] = { 3, 10, -4, 15, -9, 20, 12, 25 };
		Arrays.sort(arr);
		int key = 30;

		int[] triplet = findTriplet(arr, key);
		if (triplet == null) {
			System.out.println("Triplet not found");
		} else {
			System.out.println(Arrays.toString(triplet));
		}
	}

	private static int[] findTriplet(int ar[], int pairs) {
		for (int i = 0; i <= ar.length - 1; i++) {
			for (int j = i + 1; j <= ar.length - 1; j++) {
				int val = pairs - ar[i] - ar[j];
				if (binarySearch(val, ar)) {
					int a[] = new int[3];
					a[0] = ar[i];
					a[1] = ar[j];
					a[2] = val;
					return a;
				}
			}
		}
		return null;
	}

	private static boolean binarySearch(int val, int arr[]) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == val) {
				return true;
			} else if (arr[mid] < val) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}
		return false;

	}

}
