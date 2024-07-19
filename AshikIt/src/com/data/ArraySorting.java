package com.data;

public class ArraySorting {
	
	
	public static void main(String[] args) {
		
		int arr[]= {1,0,1,0,1,0};
		
//		Arrays.sort(arr);
//		
//		System.out.println(Arrays.toString(arr));
		int temp;
		for(int i= 0;i<=arr.length-1;i++) {
			
			for(int j=i+1;j<=arr.length-1;j++) {
				
				if(arr[i] > arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int k=0;k<=arr.length-1;k++) {
			System.out.print(arr[k]+" ");
		}
	}
	
		

}
