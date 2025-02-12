package com.data;

public class SmallestRightElement {

    public static void findSmallestRightElement(String[] arr) {
        int[] result = new int[arr.length];
        int min = Integer.MAX_VALUE;

        // Traverse the array from right to left
        for ( int i = arr.length-1; i >= 0; i--) {
            int current = Integer.parseInt(arr[i]);
            result[i] = min;
            System.out.println(min);
            if (current < min) {
                min = current;
            }
        }

        // Print the results
        for (int i = 0; i < arr.length; i++) {
            if (result[i] == Integer.MAX_VALUE) {
                System.out.println("Smallest element to the right of " + arr[i] + " is not available.");
            } else {
                System.out.println("Smallest element to the right of " + arr[i] + " is " + result[i]);
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {"11", "2", "5", "4", "10"};
        findSmallestRightElement(arr);
    }
}
