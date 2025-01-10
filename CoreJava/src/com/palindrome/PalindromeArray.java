package com.palindrome;

public class PalindromeArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 2, 1 };

		int n = arr.length;
		boolean isPalndrome = true;
		for (int i = 0; i < n / 2; i++) {
			if (arr[i] != arr[n - 1 - i]) {
				isPalndrome = false;
			}
		}
		if (isPalndrome) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
