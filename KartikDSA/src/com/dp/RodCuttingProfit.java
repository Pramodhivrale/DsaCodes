package com.dp;

public class RodCuttingProfit {
    public static int maxProfit(int[] prices, int n) {
        // Create a DP array to store the maximum profit for each length
        int[] dp = new int[n + 1];
        
        dp[0] = 0; // Base case: no rod, no profit

        // Solve for every rod length from 1 to n
        for (int i = 1; i <= n; i++) {
            int maxProfit = Integer.MIN_VALUE;
            // Try cutting the rod at every length j (1 to i)
            for (int j = 1; j <= i; j++) {
                maxProfit = Math.max(maxProfit, prices[j - 1] + dp[i - j]);
            }
            dp[i] = maxProfit; // Store the result for length i
        }

        return dp[n]; // Maximum profit for rod length n
    }

    public static void main(String[] args) {
        int[] prices = {1, 5, 8, 9, 10, 17, 17, 20};
        int n = 8; // Rod length
        System.out.println("Maximum Profit: " + maxProfit(prices, n));
    }
}

