package com.dsa1;

import java.util.Arrays;

public class CeilOfElementBinary {
	
	public static int findCeil(int arr[],int key) {
		int low=0;
		int high=arr.length-1;
		
		int ans=Integer.MAX_VALUE;
		
		while (low <= high) {
			int mid=(low + high)/2;
			if(arr[mid] == key) {
				return arr[mid];
			}
			else if (arr[mid] < key) {
				low=mid+1;
			}
			else {
				ans=arr[mid];
				high=mid-1;
			}
		}
		
		
		return ans;
		
	}
	
	public static void main(String[] args) {
		int arr[] = { 3, -7, -2, 15, 18, 12, -5, 20, 10, -13 };
		
		Arrays.sort(arr);
		int key=11;
		int ceil = findCeil(arr,key);
		if (ceil == Integer.MAX_VALUE) {
			System.out.println("No ceil found for " + key);
		} else {
			System.out.println("Ceil of " + key + " is " + ceil);
		}
	}
}
