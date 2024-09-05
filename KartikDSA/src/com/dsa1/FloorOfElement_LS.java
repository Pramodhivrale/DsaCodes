package com.dsa1;

public class FloorOfElement_LS 
{
	public static void main(String[] args) {
		int arr[]= {-5,6,3,-10,17,-7,1,9};
		int length=arr.length;
		int q[]= {-1,-2,7,5};
		
		floor(arr,length,q);
	}

	private static void floor(int[] arr, int length, int[] q) {
		for(int j=0;j<q.length;j++) {
			int ans=Integer.MIN_VALUE;
			for(int i=0;i<arr.length;i++) {
				
				if(arr[i]<=q[j] && ans<arr[i]) {
					ans=arr[i];
				}
			}
			
			System.out.println(q[j]+"  "+ans);
		}
		
	}

}
