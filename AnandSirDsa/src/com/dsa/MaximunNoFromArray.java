package com.dsa;

public class MaximunNoFromArray 
{
	public static void main(String[] args) {
		int arr[]= {10,3,15,25,9,12,17,2,5,9,4,8};
		int max=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i] < max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
