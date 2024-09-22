package com.sorting;

import java.util.Arrays;

public class CountSort1 
{
	public static void main(String[] args) {
		int arr[]= {3,5,1,3,10,2,3,9,4,3,1,4};
		int count[]=new int[11];
		for(int i=0;i<arr.length;i++) {
			count[arr[i]]++;
		}
		int freq=0;
		int element=0;
		//[0, 2, 1, 4, 2, 1, 0, 0, 0, 1, 1]
		//Using these array we can sort the original array
		for(int i=0;i<11;i++) {
			if(count[i]>freq) {
				freq=count[i];
				element=i;
			}
		}
		int index=0;
		for(int i=0;i<11;i++) {
			int x=count[i];
			for(int j=1;j<=x;j++) {
				arr[index]=i;
				index++;
			}
		}
		System.out.println(element+" "+freq);
		System.out.println(Arrays.toString(arr));
	}

}
