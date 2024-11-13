package com.recurssion;

//  FIND THE SUM OF K
public class SubsetRecurssion {
	public static void main(String[] args) {
		int arr[] = { 3, -4, 8, 10 };
		int n = 3;
		int k = 9;
		int index = 0;
		int sum = 0;
		boolean subset = subset(arr, n, k, sum, index);
		System.out.println(subset);

	}

	public static boolean subset(int arr[], int n, int k, int sum, int index) {
		if (index == n) {
			return sum == k;
		}

		return subset(arr, n, k, sum + arr[index], index + 1) | subset(arr, n, k, sum, index + 1);

	}

}
