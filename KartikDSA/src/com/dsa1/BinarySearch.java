package com.dsa1;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72 };

		int low = 0;
		int high = arr.length - 1;
		boolean flag = false;

		int target = 38;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				flag = true;
				break;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else if (arr[mid] > target) {
				high = mid - 1;
			}
		}
		 if (!flag) {
	            System.out.println("Not found");
	        } else {
	            System.out.println("Found at index: " + ((low + high) / 2));
	        }
		 
	}

}
