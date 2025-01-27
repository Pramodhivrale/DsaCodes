package com.revision;

import java.util.Arrays;

public class FloorOfElementUsingDPDay74 {
	public static void main(String[] args) {
		int[] arr = { 2, 8, 30, 15, 25 };
		int[] queries = { 5, 20, 8, 1, 30 };
		Arrays.sort(arr);

		for (int data : queries) {
			int floor = findfloor(arr, data);
			System.out.println("floor of " + data + " is :" + (floor == -1 ? "No floor" : floor));
		}
	}

	public static int findfloor(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int floor = -1;
		while (low <= high) {
			// int mid = low + high / 2;
			int mid = low + (high - low) / 2;
			if (arr[mid] == target) {
				return arr[mid]; // Exact match
			}
			if (arr[mid] < target) {
				floor = arr[mid];
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return floor;
	}

}
