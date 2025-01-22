package com.revision;

import java.util.Scanner;

public class DiceRollDpDay58 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input: Number of dice and target sum
		System.out.print("Enter the number of dice (N): ");
		int N = scanner.nextInt();

		System.out.print("Enter the target sum (S): ");
		int S = scanner.nextInt();

		// Calculate the number of ways
		int result = countWaysToAchieveSum(N, S);

		// Output the result
		System.out.println("Number of ways to achieve the sum " + S + " with " + N + " dice: " + result);

		scanner.close();
	}

	private static int countWaysToAchieveSum(int N, int S) {
	        // Edge cases
	        if (S < N || S > 6 * N) {
	            return 0; // Impossible to achieve
	        }

	        // Create DP table
	        int[][] dp = new int[N + 1][S + 1];

	        // Base case: 1 way to get sum 0 with 0 dice
	        dp[0][0] = 1;

	        // Fill the DP table
	        for (int n = 1; n <= N; n++) {
	            for (int s = 1; s <= S; s++) {
	                for (int k = 1; k <= 6; k++) {
	                    if (s >= k) {
	                        dp[n][s] += dp[n - 1][s - k];
	                    }
	                }
	            }
	        }

	        return dp[N][S];
	    }
}