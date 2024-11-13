package com.dsa1;

// FIND THE SUM OF K
public class SubsetRecurssion {
    public static void main(String[] args) {
        int arr[] = { 3, -4, 8, 10 };
        int k = 9;
        boolean subset = subset(arr, arr.length, k, 0, 0);
        System.out.println(subset);
    }

    public static boolean subset(int arr[], int n, int k, int sum, int index) {
        if (index == n) {
            return sum == k;
        }

        // Include current element in the sum or exclude it
        return subset(arr, n, k, sum + arr[index], index + 1) || subset(arr, n, k, sum, index + 1);
    }
}
