package com.recurssion;

public class MagicSquare {
    int ans = Integer.MAX_VALUE;

    void perm(int arr[], boolean taken[], int index, int mar[]) {
        if (index == 9) {
            if (isMagicSquare(arr)) {
                ans = Math.min(ans, calculateCost(arr, mar));
            }
            return;
        }

        for (int i = 1; i <= 9; i++) {
            if (!taken[i]) {
                taken[i] = true;
                arr[index] = i;
                perm(arr, taken, index + 1, mar);
                taken[i] = false;
            }
        }
    }

    // Check if the current array forms a magic square
    boolean isMagicSquare(int[] arr) {
        int magicSum = 15; // For 3x3 magic square, the magic sum is always 15
        return (arr[0] + arr[1] + arr[2] == magicSum &&
                arr[3] + arr[4] + arr[5] == magicSum &&
                arr[6] + arr[7] + arr[8] == magicSum &&
                arr[0] + arr[3] + arr[6] == magicSum &&
                arr[1] + arr[4] + arr[7] == magicSum &&
                arr[2] + arr[5] + arr[8] == magicSum &&
                arr[0] + arr[4] + arr[8] == magicSum &&
                arr[2] + arr[4] + arr[6] == magicSum);
    }

    // Calculate the cost to convert the current permutation to the target
    int calculateCost(int[] arr, int[] mar) {
        int cost = 0;
        for (int i = 0; i < 9; i++) {
            cost += Math.abs(arr[i] - mar[i]);
        }
        return cost;
    }

    public static void main(String[] args) {
        MagicSquare magicSquare = new MagicSquare();
        int[] arr = new int[9];
        boolean[] taken = new boolean[10];
        int[] targetSquare = {4, 9, 2, 3, 5, 7, 8, 1, 6}; // Example target square

        magicSquare.perm(arr, taken, 0, targetSquare);
        System.out.println("Minimum cost to convert to magic square: " + magicSquare.ans);
    }
}
