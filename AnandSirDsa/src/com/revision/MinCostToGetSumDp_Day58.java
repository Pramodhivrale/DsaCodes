package com.revision;

import java.util.Arrays;
import java.util.Scanner;

public class MinCostToGetSumDp_Day58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of dice, target sum, and cost of rolling each face
        System.out.print("Enter the number of dice (N): ");
        int N = scanner.nextInt();

        System.out.print("Enter the target sum (S): ");
        int S = scanner.nextInt();

        int[] cost = new int[7];
        System.out.println("Enter the cost for rolling 1 to 6:");
        for (int i = 1; i <= 6; i++) {
            cost[i] = scanner.nextInt();
        }

        // Calculate the minimum cost
        int result = minCostToGetSum(N, S, cost);

        // Output the result
        if (result == Integer.MAX_VALUE) {
            System.out.println("It's not possible to achieve the target sum.");
        } else {
            System.out.println("The minimum cost to achieve the sum is: " + result);
        }

        scanner.close();
    }

    private static int minCostToGetSum(int N, int S, int[] cost) {
        // Edge cases
        if (S < N || S > 6 * N) {
            return Integer.MAX_VALUE; // Impossible to achieve
        }

        // Create DP table
        int[][] dp = new int[N + 1][S + 1];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        // Base case
        dp[0][0] = 0;

        // Fill the DP table
        for (int n = 1; n <= N; n++) {
            for (int s = 1; s <= S; s++) {
                for (int k = 1; k <= 6; k++) {
                    if (s >= k && dp[n - 1][s - k] != Integer.MAX_VALUE) {
                        dp[n][s] = Math.min(dp[n][s], dp[n - 1][s - k] + cost[k]);
                    }
                }
            }
        }

        return dp[N][S];
    }
}
