package com.sorting;

public class SelcetionSort {
	public static void main(String[] args) {
		int arr[] = { 1, 8, 5, 6, 9, 3, 4, 7 };
		selectionSort(arr);
		System.out.println("Sorted array:");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static void selectionSort(int[] arr) {

		for (int i = 0; i <= arr.length - 1; i++) {
			int minimun = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minimun]) {
					minimun = j;
				}
			}
			int temp = arr[minimun];
			arr[minimun] = arr[i];
			arr[i] = temp;
		}

	}

}
