package com.dsa;

public class DuplicateFormArray3 {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 1, 3,3,1 };

		// int array[] = new int[arr.length];

		for (int i = 0; i <= arr.length - 1; i++) {

			int key = arr[i];
			int count = 0;
			for (int j = 1 + i; j <= arr.length - 1; j++) {
				if (arr[j] == key) {
					count++;
					arr[j] = -1;
				}

			}

			if(key != -1 && count > 0) {
				System.out.println(key);
			}
		}

	}
}