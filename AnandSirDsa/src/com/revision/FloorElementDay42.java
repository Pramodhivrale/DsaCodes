package com.revision;

public class FloorElementDay42 {
	public static void main(String[] args) {
		int arr[] = { -5, 6, 3, 10, 17, -7, 8, 9 };
		int q[] = { 18, 5, 19, -34, 0, 1 };

		floor(arr, q);
	}

	private static void floor(int[] arr, int[] q) {
		for (int i = 0; i < q.length; i++) {
			int min = Integer.MIN_VALUE;
			for (int j = 0; j < arr.length; j++) {
               if(arr[j] <= q[i] && arr[j] > min) {
            	   min=arr[j];
               }
			}
			System.out.println(q[i]+" -> "+min);
		}

	}

}
