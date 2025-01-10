package com.data;

public class SecondLargestElement {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 6, 7, 8, 9 };

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num < largest &&  num > secondLargest) {
				secondLargest = num;
			}
		}
		System.out.println(secondLargest);

	}
}
