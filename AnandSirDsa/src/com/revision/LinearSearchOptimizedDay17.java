package com.revision;

// Linear Search Using sorted Array And in optimized way 
public class LinearSearchOptimizedDay17 {
	public static void main(String[] args) {
		int arr[] = { -11, -4, 10, 15, 17, 20, 25, 30, 35 };
		int target = 20;
		boolean findtarget = findtarget(target, arr);
		System.out.println(findtarget);
	}

	private static boolean findtarget(int target, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (target == arr[i]) {
				return true;
			}
			if (arr[i] > target) {
				break;
			}
		}
		return false;

	}

}
