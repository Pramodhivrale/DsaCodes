package com.revision;

import java.util.Scanner;

public class PaintHouseMinCost_DP_Day59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of houses and colors
        System.out.print("Enter the number of houses: ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of colors: ");
        int k = scanner.nextInt();

        // Input: Cost matrix
        int[][] cost = new int[n][k];
        System.out.println("Enter the cost matrix (rows = houses, columns = colors):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                cost[i][j] = scanner.nextInt();
            }
        }

        // Calculate the minimum cost
        int result = findMinCost(cost, n, k);

        // Output the result
        System.out.println("The minimum cost to paint all houses is: " + result);

        scanner.close();
    }

    private static int findMinCost(int[][] cost, int n, int k) {
        if (n == 0 || k == 0) return 0;

        // DP array to store the minimum cost for each house and color
        int[][] dp = new int[n][k];

        // Base case: First house costs
        for (int j = 0; j < k; j++) {
            dp[0][j] = cost[0][j];
        }

        // Fill the DP table
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < k; j++) {
                dp[i][j] = cost[i][j] + findMinExcluding(dp[i - 1], j);
            }
        }

        // Find the minimum cost in the last row
        int minCost = Integer.MAX_VALUE;
        for (int j = 0; j < k; j++) {
            minCost = Math.min(minCost, dp[n - 1][j]);
        }

        return minCost;
    }

    private static int findMinExcluding(int[] prevRow, int excludeIndex) {
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < prevRow.length; j++) {
            if (j != excludeIndex) {
                min = Math.min(min, prevRow[j]);
            }
        }
        return min;
    }
}

