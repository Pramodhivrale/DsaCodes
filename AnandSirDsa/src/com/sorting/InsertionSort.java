package com.sorting;

import java.util.Arrays;

public class InsertionSort 
{
	public static void main(String[] args) {
		int arr[]= {2,8,5,96,4,-1,11};
		
		int size=arr.length;
		
		sort(arr,size);
		System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] arr, int size) {
		for(int i=1;i<arr.length;i++) {
			int x=arr[i];
			int j;
			for(j=i-1;j>=0;j--) {
				if(x<arr[j]) {
					arr[j+1]=arr[j];
				}
				else
					break;
			}
			arr[j+1]=x;
		}
		
	}

}
