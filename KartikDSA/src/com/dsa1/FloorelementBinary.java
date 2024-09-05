package com.dsa1;

public class FloorelementBinary 
{
	public static int meth1(int low,int high,int element,int ar[]) {
		int floorIndex=0;
		while (low <= high) {
			int mid=(low + high) /2;
			
			if(ar[mid] == element) {
				return mid;
			}
			else if (ar[mid] < element) {
				floorIndex=mid;
				low=mid+1;
			}
			else{
				//floorIndex=mid;
				high=mid-1;
			}
		}
		
		return floorIndex;
	}
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,8,10,12,19};
		
		int element=5;
		int low=0;
		int high=arr.length-1;
		
		int meth1 = meth1(low,high,element,arr);
		System.out.println(meth1);
		
		
	}

}
