package com.revision;

public class MagicSquereMinmumCostDay25 {
    public static void main(String[] args) {
        int[][] s = { 
            { 5, 3, 4 }, 
            { 1, 5, 8 }, 
            { 6, 4, 2 } 
        };
        
        // To check which element is taken
        boolean[] taken = new boolean[10];
        // To store permutations
        int arr[] = new int[9];
        
        // Initial value of mincost
        int mincost = Integer.MAX_VALUE;
        
        // Call the recursive function to generate permutations and calculate minimum cost
        mincost = genratePermutations(taken, 0, arr, s, mincost);
        
        // Print the minimum cost
        System.out.println(mincost);
    }

    private static int genratePermutations(boolean[] taken, int pos, int[] arr, int[][] s, int mincost) {
        if (pos == 9) {
            // Convert the 1D array into a 2D matrix (3x3)
            int[][] converToMatrix = converToMatrix(arr);
            // Calculate the cost to convert s into this magic square
            int calculateCost = calculateCost(s, converToMatrix);
            // Update the minimum cost
            mincost = Math.min(mincost, calculateCost);
            return mincost;
        }

        // Generate permutations and recurse
        for (int i = 1; i <= 9; i++) {
            if (taken[i]==false) {
                arr[pos] = i;
                taken[i] = true;
                mincost = genratePermutations(taken, pos + 1, arr, s, mincost);
                taken[i] = false;  // Backtrack
            }
        }
        return mincost;
    }

    private static int calculateCost(int[][] s, int[][] converToMatrix) {
        int cost = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cost += Math.abs(s[i][j] - converToMatrix[i][j]);
            }
        }
        return cost;
    }

    private static int[][] converToMatrix(int[] arr) {
        int[][] matrixGenerated = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixGenerated[i][j] = arr[i * 3 + j];
            }
        }
        return matrixGenerated;
    }
}
