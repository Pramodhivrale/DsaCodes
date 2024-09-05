package com.dsa1;

// Linear search

public class BinarySearchDemo 
{
	public static int meth1(int arr[],int key) {
		
		int low=0;
		int high=arr.length-1;
		
		while (low <= high) {
			int mid=(low + high) /2;
			if(arr[mid]==key) {
				return mid;
			}
			else if (key > arr[mid])
			{
				 low=mid+1;
			}
			else {
				high = mid - 1; 
			}
		}
		
		
		return -1;
		
	}
	public static void main(String[] args) {
		int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72,85};
		
		int index = meth1(arr,5);
		if(index != -1) {
			System.out.println("Element found at this index position :"+index);
		}
		else {
			System.out.println("Not found !");
		}
	}
	

}
