package com.dsa;

public class Duplicate_Type2_Day19 {
	public static void main(String[] args) {

		int arr[] = {1000,1000,1000,1000,200,200};
		int size = arr.length;

		for (int i = 0; i < size; i++) {
			int key = arr[i];
			int count = 0;
			for (int j = i + 1; j < size; j++) {
				if (arr[j] == key) {
					count++;
					arr[j] = -1;
				}

			}
			if (key != -1 && count > 0) {
				System.out.println(key);
			}

		}

	}

}
