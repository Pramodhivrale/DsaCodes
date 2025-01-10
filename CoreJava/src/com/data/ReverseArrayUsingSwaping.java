package com.data;

import java.util.Arrays;

public class ReverseArrayUsingSwaping {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 6, 7 };

		int start = 0;
		int end = arr.length-1;

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			end--;
			start++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
