package com.revision;


public class MaximumSubarraySumKdanesAlgorithamDay60 {
    public static void main(String[] args) {
        int[] arr = {3, -4, 2, -3, -1};

        int result = findMaximumSubarraySum(arr);
        System.out.println("The maximum subarray sum is: " + result);
    }

    private static int findMaximumSubarraySum(int[] arr) {
        int currentMax = arr[0];  // Initialize the current max as the first element
        int globalMax = arr[0];   // Initialize the global max as the first element

        // Iterate through the array starting from index 1
        for (int i = 1; i < arr.length; i++) {
            // Update currentMax by choosing the maximum between:
            // - starting a new subarray with arr[i]
            // - extending the current subarray by adding arr[i]
            currentMax = Math.max(arr[i], currentMax + arr[i]);

            // Update the globalMax if currentMax is larger
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }
}

