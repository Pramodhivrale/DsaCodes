package com.dp;

import java.util.Arrays;

public class CoinChange {
    public static int minCoins(int[] coins, int amount) {
        // Create a DP array with maximum value (amount + 1)
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0; // Base case: 0 coins are needed for amount 0
        
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        // If dp[amount] is still amount + 1, it means no combination is possible
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int result = minCoins(coins, amount);
        System.out.println(result == -1 ? "Not possible" : "Minimum coins: " + result);
    }
}

