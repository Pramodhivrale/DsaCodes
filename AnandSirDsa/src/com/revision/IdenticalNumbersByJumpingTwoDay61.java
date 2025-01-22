package com.revision;

public class IdenticalNumbersByJumpingTwoDay61 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 2, 4 };

		boolean result = findIdenticalByJumpingTwo(arr);
		System.out.println("Are there identical numbers with a jump of 2? " + result);
	}

	private static boolean findIdenticalByJumpingTwo(int[] arr) {
		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i] == arr[i + 2]) {
				return true;
			}
		}
		return false;
	}

}
