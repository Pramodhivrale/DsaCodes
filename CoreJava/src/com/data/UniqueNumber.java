package com.data;

public class UniqueNumber 
{
	public static void main(String[] args) {
		int arr[]= {3,7,7,1,3,3,8};
		
		for(int i=0;i<=arr.length-1;i++) {
			
			int count=0;
			
			for(int j=0;j<=arr.length-1;j++) {
				
				if(arr[i]==arr[j]) {
					count++;
				}
				
			}
			if(count==1) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}
	

}