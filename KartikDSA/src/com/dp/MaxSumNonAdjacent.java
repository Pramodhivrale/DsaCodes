package com.dp;

public class MaxSumNonAdjacent {
    public static int maxSum(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int include = nums[0]; // Maximum sum including the first element
        int exclude = 0;       // Maximum sum excluding the first element

        for (int i = 1; i < nums.length; i++) {
            int temp = include; // Store the current include value
            include = Math.max(include, exclude + nums[i]); // Update include to max of (previous include or current + previous exclude)
            exclude = temp; // Update exclude to the previous include
        }

        return Math.max(include, exclude);
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 7, 10};
        System.out.println("Maximum Sum of Non-Adjacent Elements: " + maxSum(nums));
    }
}


