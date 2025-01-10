package com.revision;

import java.util.Arrays;

public class MargeSort1 {
	public static void main(String[] args) {
		int[] array = { 12, 11, 13, 5, 6, 7 };
		int si = 0;
		int ei = array.length - 1;

		halfSort(array, si, ei);
		System.out.println(Arrays.toString(array));
	}

	private static void halfSort(int[] array, int si, int ei) {
		if (si >= ei) {
			return;
		}
		int mid = (si + ei) / 2;
		halfSort(array, si, mid);
		halfSort(array, mid + 1, ei);
		marge(array, si, ei, mid);
	}

	private static void marge(int[] array, int si, int ei, int mid) {
		int margee[] = new int[ei - si + 1];
		int low = si;
		int high = ei;
		int midindex = mid + 1;
		int x = 0;
		while (low <= mid && midindex <= high) {
			if (array[low] <= array[midindex]) {
				margee[x++] = array[low++];
			} else {
				margee[x++] = array[midindex++];
			}
		}
		while (low <= mid) {
			margee[x++] = array[low++];
		}
		while (midindex <= ei) {
			margee[x++] = array[midindex++];
		}

		for (int i = 0; i < margee.length; i++) {
			array[si + i] = margee[i];
		}
	}
}
