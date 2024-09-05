package com.dsa1;

public class SumOFPairs
{
	public static void main(String[] args) {
		int arr[]= {3,10,-4,15,-9,20,12,25};
		int pairs=30;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]+arr[i]==pairs) {
					System.out.println("Pair :"+arr[j]+"   "+arr[i]);
				}
			}
		}
	}

}
