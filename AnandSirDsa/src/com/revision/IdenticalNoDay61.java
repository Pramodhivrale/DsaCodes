package com.revision;

public class IdenticalNoDay61 {
    public static void main(String[] args) {
        // Sample array where all elements appear twice except one
        int[] ar = {1, 1, 2, 2, 3, 4, 4, 5, 5};
        
        // Call the binary search method and print the result
        System.out.println("The element that appears once is: " + bs(ar));
    }

    private static int bs(int[] ar) {
        int lo = 0;
        int hi = ar.length - 1;

        // Perform binary search
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            // Check if mid is the element that appears only once
            if (mid > 0 && mid < ar.length - 1 && ar[mid] != ar[mid - 1] && ar[mid] != ar[mid + 1]) {
                return ar[mid];
            }

            // If mid is even, check the right pair
            if (mid % 2 == 0) {
                if (ar[mid] == ar[mid + 1]) {
                    lo = mid + 2; // Skip the pair
                } else {
                    hi = mid - 1;
                }
            } else { // If mid is odd, check the left pair
                if (ar[mid] == ar[mid - 1]) {
                    lo = mid + 1; // Skip the pair
                } else {
                    hi = mid - 1;
                }
            }
        }
        
        // If no element is found (shouldn't happen in this problem)
        return -1;
    }
}
