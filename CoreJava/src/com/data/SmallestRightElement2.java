package com.data;

public class SmallestRightElement2 {
	void meeth1() {
		int[] arr = { 11, 2, 5, 4, 10, 19 };

		int max = arr[0];
		for (int i = 0; i <= arr.length - 1; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}

	public static void main(String[] args) {
		new SmallestRightElement2().meeth1();
	}

}
