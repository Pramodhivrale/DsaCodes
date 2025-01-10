package com.revision;

public class BinarySearch40 {
	public static void main(String[] args) {
		int arr[] = { -11, -4, 10, 15, 17, 20, 25, 30 };
		int key = 10;
		int index = binarysearch(arr, key);
		System.out.println(index);
	}

	private static int binarysearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				return mid;
			}
			if (arr[mid] < key) {
				low = mid + 1;
			} else if(arr[mid] > key) {
				high = mid - 1;
			}
		}
		return -1;
	}
}
