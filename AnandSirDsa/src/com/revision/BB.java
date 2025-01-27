package com.revision;

import java.util.Arrays;

public class BB {
	public static void main(String[] args) {
		int[] arr = { 64, 34, 25, 12, 22, 11, 90,1,-1 };
		for (int i = 0; i <arr.length; i++) {
			//boolean flag = false;
			for (int j = 0; j <arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					//flag = true;
				}
			}
//			if (flag == false) {
//				break;
//			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
