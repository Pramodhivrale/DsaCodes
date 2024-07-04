package com.data;

public class MissingElement {

	private static void m1(int[] arr2) {

		for (int i = 1; i <= 10; i++) {
			boolean flag = false;

			for (int j = 0; j <= arr2.length - 1; j++) {
				if (arr2[j] == i) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("Missing number :" + i);
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };

		m1(arr);

	}

}
