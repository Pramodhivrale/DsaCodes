package com.dsa1;

import java.util.Stack;

public class NearestSmallestElementStack {
	 public static void main(String[] args) {
	        int arr[] = {10, 3, 15, 25, 9, 12, 17, 2, 5, 9, 4, 8};
	        int n = arr.length;

	        Stack<Integer> stack = new Stack<>();
	        int[] result = new int[n];

	        // Traverse the array from right to left
	        for (int i = n - 1; i >= 0; i--) {  // Ensure we are within bounds by starting at n-1
	            // Pop elements from the stack if they are greater than or equal to the current element
	            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
	                stack.pop();
	            }

	            // If the stack is empty, there is no smaller element on the right
	            if (stack.isEmpty()) {
	                result[i] = -1;
	            } else {
	                // The top of the stack is the nearest smaller element on the right
	                result[i] = stack.peek();
	            }

	            // Push the current element onto the stack
	            stack.push(arr[i]);
	        }

	        // Print the result array
	        for (int res : result) {
	            System.out.println(res);
	        }
	    }
}
