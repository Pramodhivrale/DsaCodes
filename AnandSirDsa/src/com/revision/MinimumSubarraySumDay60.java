package com.revision;

//Kadane's Algorithm for Minimum Sum
public class MinimumSubarraySumDay60 {
	public static void main(String[] args) {
		// Predefined array of integers
		int[] arr = { 3, -4, 2, -3, -1 };

		// Find and print the minimum subarray sum
		int result = findMinimumSubarraySum(arr);
		System.out.println("The minimum subarray sum is: " + result);
	}

	private static int findMinimumSubarraySum(int[] arr) {
		int currentMin = arr[0];
		int golobl = arr[0];
		for (int i = 0; i < arr.length; i++) {
			currentMin = Math.min(arr[i], currentMin + arr[i]);
			golobl = Math.min(currentMin, golobl);
		}
		return golobl;
	}
}
