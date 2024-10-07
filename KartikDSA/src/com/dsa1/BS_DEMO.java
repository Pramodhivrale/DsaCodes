package com.dsa1;

public class BS_DEMO {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72 };
		int key = 50;
		boolean bs = bs(arr, key);
		if(!bs) {
			System.out.println("Element found");
		}
		else {
			System.out.println("element not found");
		}

	}

	private static boolean bs(int[] arr, int key) {
		boolean flag = false;
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				flag = true;
				break;
			}
			if (arr[mid] > key) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return false;
	}

}
