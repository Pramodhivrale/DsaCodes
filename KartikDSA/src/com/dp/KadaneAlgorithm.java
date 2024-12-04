package com.dp;

// MAX SUBARRAY SUM
public class KadaneAlgorithm {
	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println("Maximum Subarray Sum: " + maxSubarraySum(nums));
	}

	private static int maxSubarraySum(int[] nums) {
		int maxsofar = nums[0];
		int currentmax = nums[0];

		for (int i = 1; i < nums.length; i++) {
			currentmax = Math.max(nums[i], currentmax + nums[i]);
			maxsofar = Math.max(maxsofar, currentmax);
		}
		return maxsofar;
	}

}
