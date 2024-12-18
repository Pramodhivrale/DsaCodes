package com.revision;

// To perform binary Search Array always should be sorted 
// Array must be sorted for binary Search
public class BinarySearchDayDay17 {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72 };
		int low = 0;
		int high = arr.length - 1; // Corrected bounds
		int target = 38;
		binarySearch(low, high, arr, target);
	}

	private static void binarySearch(int low, int high, int[] arr, int key) {
		while (low <= high) {
			// int mid = low + (high - low) / 2; // Prevent overflow
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				System.out.println("Found at index: " + mid);
				return; // Exit after finding the element
			}
			if (arr[mid] < key) {
				low = mid + 1; // Search in the right half
			} else {
				high = mid - 1; // Search in the left half
			}
		}
		System.out.println("Not Found"); // If the loop completes, the key is not present
	}
}
