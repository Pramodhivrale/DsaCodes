package com.revision;

import java.util.Arrays;

// Searching sorted array with efficient way
public class LinearSearch_Day3 {
	public static void main(String[] args) {
		int arr[] = { -11, -4, 10, 15, 17, 20, 25, 30, 35 };
		Arrays.sort(arr);
		int key = 10;
		boolean findkay = findkay(key, arr);
		if(findkay) {
			System.out.println("Found");
		}else {
			System.out.println("Not found");
		}

	}

	private static boolean findkay(int key, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return true;
			}
			if (arr[i] > key) {
				break;
			}
		}
		return false;

	}

}
