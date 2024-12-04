package com.dsa1;

public class DuplicateElement {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 20, 40, 10, 20 };

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == num) {
					count++;
					arr[j] = -1;
				}
			}
			if (num != -1 && count > 0) {
				System.out.println(num);
			}
		}

	}

}

class Duplicate {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 20, 40, 10, 20 };

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int key = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == key) {
					arr[j] = -1;
					count++;
				}
			}
			if (key != -1 && count > 0) {
               System.out.println(arr[key]);
			}
		}
	}
}
