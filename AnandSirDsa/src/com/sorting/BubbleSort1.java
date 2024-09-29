package com.sorting;

// TIME COMPLEXITY O(N^2)
// SPACE COMPLEXITY O(N)
public class BubbleSort1 
{
	public static void main(String[] args) {
		int arr[]= {8,5,2,9,6,3,-1};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
