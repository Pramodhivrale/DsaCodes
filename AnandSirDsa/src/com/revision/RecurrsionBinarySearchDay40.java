package com.revision;

public class RecurrsionBinarySearchDay40 {
    public static void main(String[] args) {
        int arr[] = { -11, -4, 10, 15, 17, 20, 25, 30 }; // Sorted array
        int key = 10; // The element to search for
        int low = 0;
        int high = arr.length - 1;
        boolean binarysearch = binarysearch(arr, low, high, key);
        System.out.println("Key found: " + binarysearch);
    }

    private static boolean binarysearch(int[] arr, int low, int high, int key) {
        if (low > high) { // Base condition: If low crosses high, the key is not found
            return false;
        }

        int mid = (low + high) / 2; // Calculate the mid-point

        if (arr[mid] == key) {
            return true; // Key found
        }

        if (arr[mid] < key) {
            // Search in the right half
            return binarysearch(arr, mid + 1, high, key);
        } else {
            // Search in the left half
            return binarysearch(arr, low, mid - 1, key);
        }
    }
}
