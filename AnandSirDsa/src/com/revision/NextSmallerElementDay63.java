package com.revision;

import java.util.Stack;

public class NextSmallerElementDay63 {
    public static void main(String[] args) {
        int arr[] = { 7, 1, 3, 5, 8, 4, -1, 13 };
        int[] result = findNextSmallerElements(arr);

        // Print the result
        for (int data : result) {
            System.out.print(data + " ");
        }
    }

    public static int[] findNextSmallerElements(int[] arr) {
        int n = arr.length; // Get the length of the array
        int[] result = new int[n]; // Result array to store next smaller elements
        Stack<Integer> stack = new Stack<>(); // Stack to help with the solution

        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Remove elements from stack that are greater than or equal to the current element
            while (!stack.isEmpty() && arr[i] <= stack.peek()) {
                stack.pop();
            }

            // If the stack is empty, there is no smaller element
            if (stack.isEmpty()) {
                result[i] = Integer.MIN_VALUE;
            } else {
                // Otherwise, the top of the stack is the next smaller element
                result[i] = stack.peek();
            }

            // Push the current element onto the stack
            stack.push(arr[i]);
        }

        return result;
    }
}
