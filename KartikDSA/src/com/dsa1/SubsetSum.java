package com.dsa1;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {

    // Method to find subsets with sum equal to k
    public List<List<Integer>> findSubsetsWithSum(int[] nums, int k) {
        List<List<Integer>> result = new ArrayList<>();
        findSubsets(0, nums, k, new ArrayList<>(), result);
        return result;
    }

    private void findSubsets(int index, int[] nums, int target, List<Integer> current, List<List<Integer>> result) {
        // If target is 0, add the current subset to the result
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // If index exceeds array size or target becomes negative, return
        if (index >= nums.length || target < 0) {
            return;
        }

        // Include the current element
        current.add(nums[index]);
        findSubsets(index + 1, nums, target - nums[index], current, result);

        // Exclude the current element (backtrack)
        current.remove(current.size() - 1);
        findSubsets(index + 1, nums, target, current, result);
    }

    public static void main(String[] args) {
        SubsetSum subsetSum = new SubsetSum();

        int[] nums = {2, 3, 5, 7, 8};
        int target = 10;

        List<List<Integer>> subsets = subsetSum.findSubsetsWithSum(nums, target);
        System.out.println("Subsets with sum " + target + ": " + subsets);
    }
}
