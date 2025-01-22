package com.revision;

import java.util.Scanner;

public class NumberOfWaysToGetSumDay58 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input the target sum and the set of numbers
		System.out.print("Enter the target sum (i): ");
		int targetSum = scanner.nextInt();

		System.out.print("Enter the size of the array (n): ");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int j = 0; j < n; j++) {
			arr[j] = scanner.nextInt();
		}

		// Calculate the number of ways to get the target sum
		int result = countWaysToGetSum(arr, targetSum);

		// Output the result
		System.out.println("Number of ways to achieve the sum " + targetSum + ": " + result);

		scanner.close();
	}

	public static int countWaysToGetSum(int[] arr, int targetSum) {
		// Create a dp array to store the number of ways for each sum
        int[] dp = new int[targetSum + 1];

        // Base case: There's one way to make a sum of 0
        dp[0] = 1;

        // Fill the dp array
        for (int num : arr) {
            for (int j = num; j <= targetSum; j++) {
                dp[j] += dp[j - num];
            }
        }

        return dp[targetSum];
	}

}
