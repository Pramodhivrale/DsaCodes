package com.revision;

public class CombinationsDay60 {
    public static void main(String[] args) {
        int i = 5; // Total number of items
        int j = 2; // Number of items to select
        
        int result = calculateCombinations(i, j);
        System.out.println("Number of ways to select " + j + " items from " + i + " items: " + result);
    }

    private static int calculateCombinations(int i, int j) {
        // If j is more than i, there are no possible combinations
        if (j > i) {
            return 0;
        }

        // If j is 0 or j is equal to i, there's only one way to select the items
        if (j == 0 || j == i) {
            return 1;
        }

        // Calculate C(i, j) using the formula: i! / (j! * (i - j)!)
        return factorial(i) / (factorial(j) * factorial(i - j));
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
