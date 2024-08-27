package com.dsa1;

import java.util.Arrays;

public class SumOFArrayAndMINMAX 
{
	public static void main(String[] args) {
		
		int arr[]= {9,1,5,3,4};
		int sum=0;
		int pairssum=0;
		for(int i=0;i<=arr.length-1;i++) {
			sum=sum+arr[i];
		}
		
		int pairs[][] = new int[5][4];
		for (int i = 0; i < 5; i++) {
		    System.arraycopy(arr, i, pairs[i], 0, 4);
		}
	    
	   
	}

}
