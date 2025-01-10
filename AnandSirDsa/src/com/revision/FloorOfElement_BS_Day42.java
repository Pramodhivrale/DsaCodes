package com.revision;

public class FloorOfElement_BS_Day42 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 8, 10, 12, 19 };
		int element = 5;
		int low = 0;
		int high = arr.length - 1;
		int result = floor(arr, low, high, element);
		if (result == -1) {
			System.out.println("No floor exists for the element " + element);
		} else {
			System.out.println("Floor of " + element + " is: " + result);
		}
	}

	private static int floor(int[] arr, int low, int high, int element) {
		int floorindex = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == element) {
				return arr[mid];
			}
			if (arr[mid] < element) {
				floorindex = arr[mid];
				low = mid + 1;
			} else if (arr[mid] > element) {
				high = mid - 1;
			}
		}
		return floorindex;
	}

}
