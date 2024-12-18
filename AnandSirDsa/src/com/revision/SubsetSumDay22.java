package com.revision;

public class SubsetSumDay22 {
	public static void main(String[] args) {
		int arr[] = { 3, -4, 8, 10 };
		int n = arr.length;
		int k = 9;
		int index = 0;
		int sum = 0;

		boolean findsum = findsum(arr, n, k, index, sum);
		System.out.println(findsum);
	}

	private static boolean findsum(int[] arr, int n, int k, int index, int sum) {
		if (index == arr.length) {
			return sum == k;
		}
		// Include the sum                                       exclude the sum
		return findsum(arr, n, k, index+1, sum+arr[index]) || findsum(arr, n, k, index+1, sum);
	}

}
