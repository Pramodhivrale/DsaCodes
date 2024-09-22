package com.dsa1;

public class NearestSmallestElement 
{
	public static void main(String[] args) {
	    int arr[] = {10, 3, 15, 25, 9, 12, 17, 2, 5, 9, 4, 8};
	    
	    for(int i=0;i<=arr.length-1;i++) {
	    	boolean flag=false;
	    	for(int j=i+1;j<=arr.length-1;j++) {
	    		if(arr[i] > arr[j]) {
	    			System.out.println(arr[j]);
	    			flag=true;
	    			break;
	    		}
	    		
	    		
	    	}
	    	if(!flag) {
	    		System.out.println(-1);
	    	}
	    }
	    

	}

}
