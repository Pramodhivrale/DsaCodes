package com.pattern.ananddsa;

public class UniqueNumber_Day7 {
	public static void main(String[] args) {
		int arr[] = { 3, 7, 7, 1, 3, 3, 8 };
		for (int i = 0; i < arr.length; i++) {
			int count=0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(arr[i]);
			}
		}

	}
}
