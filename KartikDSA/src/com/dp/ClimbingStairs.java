package com.dp;

public class ClimbingStairs {

    // Standard DP Array Approach
    public static int climbStairsDPArray(int n) {
        if (n <= 1) return 1; // Base case
        int[] dp = new int[n + 1]; // DP array
        dp[0] = 1; // 1 way to stay at step 0
        dp[1] = 1; // 1 way to reach step 1
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]; // Recurrence relation
        }
        return dp[n]; // Final result
    }

    // Space-Optimized Approach
    public static int climbStairsSpaceOptimized(int n) {
        if (n <= 1) return 1; // Base case
        int prev1 = 1, prev2 = 1; // Initialize for dp[0] and dp[1]
        for (int i = 2; i <= n; i++) {
            int current = prev1 + prev2; // Recurrence relation
            prev2 = prev1; // Update prev2 to prev1
            prev1 = current; // Update prev1 to current
        }
        return prev1; // Final result
    }

    public static void main(String[] args) {
        int n = 5; // Example input

        // Using DP Array
        System.out.println("Number of ways to climb " + n + " stairs (DP Array): " + climbStairsDPArray(n));

        // Using Space-Optimized Approach
        System.out.println("Number of ways to climb " + n + " stairs (Space Optimized): " + climbStairsSpaceOptimized(n));
    }
}

