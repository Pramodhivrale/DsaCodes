package com.bitmanupulation;

import java.util.ArrayList;
import java.util.List;

public class SubsetSumBitmask {

    public List<List<Integer>> findSubsetsWithSum(int[] nums, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        // Iterate over all possible subsets (2^n subsets)
        for (int mask = 0; mask < (1 << n); mask++) {
            List<Integer> subset = new ArrayList<>();
            int sum = 0;

            // For each bit in the mask, decide whether to include the corresponding element
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) { // Check if the i-th bit is set
                    subset.add(nums[i]);
                    sum += nums[i];
                }
            }

            // If the sum of the subset matches the target, add it to the result
            if (sum == k) {
                result.add(subset);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SubsetSumBitmask subsetSum = new SubsetSumBitmask();

        int[] nums = {2, 3, 5, 7};
        int target = 10;

        List<List<Integer>> subsets = subsetSum.findSubsetsWithSum(nums, target);
        System.out.println("Subsets with sum " + target + ": " + subsets);
    }
}
