package com.sorting;

public class MergeSort {

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    private static void conquer(int[] arr, int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];

        int indx1 = si;       // Pointer for the left half
        int indx2 = mid + 1;  // Pointer for the right half
        int x = 0;            // Pointer for the merged array

        while (indx1 <= mid && indx2 <= ei) {
            if (arr[indx1] <= arr[indx2]) {
                merged[x++] = arr[indx1++];
            } else {
                merged[x++] = arr[indx2++];
            }
        }

        // Copy any remaining elements from the left half
        while (indx1 <= mid) {
            merged[x++] = arr[indx1++];
        }

        // Copy any remaining elements from the right half
        while (indx2 <= ei) {
            merged[x++] = arr[indx2++];
        }

        // Copy the merged elements back into the original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        int[] array = { 12, 11, 13, 5, 6, 7 };
        int n = array.length;

        // Call divide function to start sorting
        divide(array, 0, n - 1);
        
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
