package com.revision;

import java.util.Arrays;

public class MargeSortDay39 {
	public static void main(String[] args) {
		int[] array = { 12, 11, 13, 5, 6, 7 };
		int low = 0;
		int high = array.length - 1;
		divide(array, low, high);
		System.out.println(Arrays.toString(array));
	}

	public static void divide(int[] array, int low, int high) {
		if(low >= high) {
			return;
		}
		int mid = (low + high) / 2;
		divide(array, low, mid);
		divide(array, mid + 1, high);
		marge(array, low, high, mid);
	}
	public static void marge(int[] array, int low, int high, int mid) {
		int start = low;
		int midindex = mid + 1;
		int x = 0;
		int[] marged = new int[high-low+1];
		while (start <= mid && midindex <= high) {
			if (array[start] <= array[midindex]) {
				marged[x] = array[start];
				x++;
				start++;
			} else {
				marged[x] = array[midindex];
				x++;
				midindex++;
			}
		}
		while (start <= mid) {
			marged[x++] = array[start++];
		}
		while (midindex <= high) {
			marged[x] = array[midindex];
			x++;
			midindex++;
		}
		System.out.println(Arrays.toString(marged));
		
		for(int i=0;i<marged.length;i++) {
			array[low+i]=marged[i];
		}	
	}

}
