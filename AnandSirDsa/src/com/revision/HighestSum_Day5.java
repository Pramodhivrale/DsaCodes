package com.revision;

//If you want the highest sum of 4 elements, you need to exclude the smallest element
//from the array since it contributes the least to the sum.
public class HighestSum_Day5 {
	public static void main(String[] args) {
		int[] arr = { 3, 1, 9, 7, 5 };
		System.out.println("Max sum :" + maxsum(arr));
	}

	private static int maxsum(int[] arr) {
		if (arr.length != 5) {
			throw new IllegalArgumentException("Array length should be five");
		}
		int totalsum = 0;
		int minElement = Integer.MAX_VALUE;
		for (int num : arr) {
			totalsum = totalsum + num;
			minElement = Math.min(minElement, num);
		}

		return totalsum - minElement;
	}

}
