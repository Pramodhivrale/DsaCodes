package com.dsa1;

public class CountElementBinarySearch {
	public static void main(String[] args) {
		int arr[] = { 3, 3, 3, 3, 4, 4, 4, 4, 7, 7, 7, 7, 8, 8, 8, 8 };
		int target = 4;

		int firstOccurrence = findFirstOccurrence(arr, target);
		int lastOccurrence = findLastOccurrence(arr, target);

		if (firstOccurrence == -1 || lastOccurrence == -1) {
			System.out.println("Element " + target + " not found in the array.");
		} else {
			int count = lastOccurrence - firstOccurrence + 1;
			System.out.println("Element " + target + " occurs " + count + " times.");
		}
	}

	// Function to find the first occurrence of the target using binary search
	private static int findFirstOccurrence(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int firstOccurrence = -1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == target) {
				firstOccurrence = mid;
				high = mid - 1; // Move left to find the first occurrence
			} else if (arr[mid] > target) {
				high = mid - 1; // Move left
			} else {
				low = mid + 1; // Move right
			}

		}

		return firstOccurrence;
	}

	// Function to find the last occurrence of the target using binary search
	private static int findLastOccurrence(int[] arr, int target) {

		int low = 0;
		int high = arr.length - 1;
		int lastOccurrence = -1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				lastOccurrence = mid;
				low = mid + 1;
			} else if (arr[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}
		return lastOccurrence;
	}
}
