package com.practice;

import java.util.Arrays;

public class ManualSort 
{
	public static void main(String[] args) {
		int arr[]= {6,7,2,5,9,10,4};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}