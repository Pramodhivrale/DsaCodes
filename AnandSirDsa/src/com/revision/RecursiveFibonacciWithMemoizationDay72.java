package com.revision;

// Using dynamic programming
public class RecursiveFibonacciWithMemoizationDay72 {
	public static void main(String[] args) {
		int n = 10;
		int arr[] = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			arr[i] = -1;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(fib(i, arr));
		}
	}

	public static int fib(int n, int[] arr) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (arr[n] != -1) {
			return arr[n];
		}
		arr[n] = fib(n - 1, arr) + fib(n - 2, arr);
		return arr[n];

	}

}
