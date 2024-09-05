package com.dsa1;

public class FloorOfElement {
	
	public static void main(String[] args) {
		int arr[] = {-5, 6, 3, 10, 17, -7, 8, 9};
		int q[] = {18, 5, 19, -34, 0, 1};
		
		for(int i = 0; i < q.length; i++) {
			int ans = Integer.MIN_VALUE;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] <= q[i] && arr[j] > ans) {
					ans = arr[j];
				}
			}
			
			if(ans == Integer.MIN_VALUE) {
				System.out.println("No floor found for " + q[i]);
			} else {
				System.out.println("Floor of " + q[i] + " is " + ans);
			}
		}
	}

}
