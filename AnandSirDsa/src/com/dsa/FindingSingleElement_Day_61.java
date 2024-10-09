package com.dsa;

// int arr[] = { 1, 1, 2, 2, 3, 5, 5, 7, 7 };
// FIND THE NUMBER WHICH DOESNT HAVE PAIR
import java.util.Scanner;

public class FindingSingleElement_Day_61 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 1, 2, 2, 3, 5, 5, 7, 7 };

		int bs = bs(arr);
		System.out.println(bs);
		sc.close();

	}

	private static int bs(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		if(arr.length==1)
            return arr[0];
		if(arr[0]!=arr[1])
			return arr[0];
		if(arr[arr.length-1] != arr[arr.length-2])
			return arr[arr.length-1];
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
				return arr[mid];
			}
			if (mid % 2 == 0) {
				if (arr[mid] == arr[mid + 1]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			} else {
				if (arr[mid] == arr[mid - 1]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;

	}

}
