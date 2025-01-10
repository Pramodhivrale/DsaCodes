package com.search;

public class BinarySearch 
{
	public static void meth1(int ar[],int s,int key) 
	{
		int low=0;
		int heigh=ar.length-1;
		
		while(low <= heigh) 
		{
			 int mid=(low+heigh)/2;
			 
			 if(ar[mid]> key) {
				 heigh=mid-1;
			 }
			 else if (ar[mid]<key) {
				 low=mid+1;
				
			}
			
		}
		System.out.println("After While Loop :"+low+" "+heigh);
		System.out.println("False");
		
	}
	public static void main(String[] args) {
		int arr[]= {-11,-4,10,15,17,20,25,30};
		int key=10;
		int size=arr.length;
		BinarySearch.meth1(arr, size, key);
	}

}
