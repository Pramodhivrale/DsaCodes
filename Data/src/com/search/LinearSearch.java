package com.search;

public class LinearSearch 
{
	public static void meth1(int ar[],int s,int n) 
	{
		for(int i=0;i<s;i++) {
			if(ar[i]==n) 
			{
				System.out.println(ar[i]);	
			}
		}
		
		
	}
	public static void main(String[] args) {
		
		int arr[]= {-11,-4,10,15,17,20,25,30,35};
		int key=15;
		int size=arr.length;
		LinearSearch.meth1(arr, size, key);
		
	}

}
