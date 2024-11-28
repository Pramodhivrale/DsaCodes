package com.dsa;

public class Max {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 9, 45 };
		int max = Integer.MIN_VALUE;
		for (int num : arr) {
			max = Math.max(max, num);
		}
		System.out.println(max);
	}

}
