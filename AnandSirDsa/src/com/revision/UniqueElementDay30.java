package com.revision;

public class UniqueElementDay30 {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 7, 2, 4 };
		int result = 0;

		for (int data : arr) {
			result = result ^ data;
		}
		System.out.println(result);
	}
}
