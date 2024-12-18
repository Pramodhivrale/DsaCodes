package com.revision;

public class Day_19_Duplicate2 {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 4, 5, 1, 2, 2, 4 };
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
                if(arr[j]==key) {
                	count++;
                	arr[j]=-1;
                }
			}
			if(count > 1 && arr[i] != -1) {
				System.out.println(key);
			}
		}
	}
}
