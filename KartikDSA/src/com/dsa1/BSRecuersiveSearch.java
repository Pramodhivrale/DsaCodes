package com.dsa1;

public class BSRecuersiveSearch {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48, 52 };

		int key = 32;
		int low = 0;
		int high = arr.length - 1;

		int index = binarysearchRecuresive(arr, key, low, high);
		if (index != -1) {
           System.out.println("Element :"+ key + " found at :"+index+" ");
		}else {
			System.out.println("Element :"+key+ " element not found");
		}
	}

	private static int binarysearchRecuresive(int[] arr, int key, int low, int high) {
		if (low > high) {
			return -1;
		}
		int mid = (low + high) / 2;
		if (arr[mid] == key) {
			return mid;
		}
		if (arr[mid] > key) {
			return binarysearchRecuresive(arr, key, low, mid - 1);
		} else {
			return binarysearchRecuresive(arr, key, mid+1, high);
		}

	}

}
