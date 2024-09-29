package com.dsa1;

public class MaxElementInWindow 
{
	public static void main(String[] args) {
		int arr[]= {10,15,45,25,15,5,95,7,3,12,56,89,78,45,12,85,63,78,41,52,22,12,96,10};
		
		int k=4;
		
		for(int i=0;i<arr.length-k;i++) {
			int max=arr[i];
			for(int j=i+1;j<i+k;j++) {
				if(arr[j]>max) {
					max=arr[j];
				}
			}
			
			 System.out.println("Maximum in window starting at index " + i + " is " + max);
		}
		
	}

}
