package com.dsa1;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindow {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 2, 7, 1, 9, 4, 8, 10, 2, 7, 4 };
        int k = 4;
        solve(arr, k, arr.length);
    }

    private static void solve(int[] arr, int k, int n) {
        // Use a deque to store the indices of array elements
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // Remove elements from the back of deque that are smaller than the current element
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }

            // Add the current element's index to the deque
            deque.addLast(i);

            // Remove the front element of deque if it's out of the sliding window's range
            if (deque.peekFirst() == i - k) {
                deque.pollFirst();
            }

            // Print the maximum element of the current window when we've processed at least k elements
            if (i >= k - 1) {
                System.out.println(arr[deque.peekFirst()]);
            }
        }
    }
}
