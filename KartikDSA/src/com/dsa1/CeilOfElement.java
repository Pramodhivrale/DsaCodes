package com.dsa1;

public class CeilOfElement {
	public static void main(String[] args) {
		int arr[] = { 3, -7, -2, 15, 18, 12, -5, 20, 10, -13 };

		int q[] = { 18, 10, 17, -3, 25, 20, 11 };

		for (int i = 0; i < q.length; i++) {
			int ceil = Integer.MAX_VALUE;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] >= q[i] && arr[j] < ceil) {
					ceil = arr[j];
				}

			}

			if (ceil == Integer.MAX_VALUE) {
				System.out.println("No ceil found for " + q[i]);
			} else {
				System.out.println("Ceil of " + q[i] + " is " + ceil);
			}
		}

	}

}
