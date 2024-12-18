package com.practice;

import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {
	public static void main(String[] args) {
		Integer[] arr = { 3, 5, 1, 4, 2 };

		Arrays.sort(arr);
		// ASCENDING ORDER
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr, Collections.reverseOrder());
		// DESCENDING ORDER
		System.out.println(Arrays.toString(arr));

		// Sort array manually
		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < arr.length; j++) {
                 if(arr[i]>arr[j]) {
                	 temp=arr[i];
                	 arr[i]=arr[j];
                	 arr[j]=temp;
                 }
			}
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}

	}

}
