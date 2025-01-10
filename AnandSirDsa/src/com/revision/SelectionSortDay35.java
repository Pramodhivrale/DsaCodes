package com.revision;

public class SelectionSortDay35 {
	public static void main(String[] args) {
		int arr[] = { 8, 7, 6, 5, 4, 3 };

		for (int i = 0; i < arr.length; i++) {
			int smallest = i;
			for (int j = i + 1; j < arr.length; j++) {
               if(arr[j]<arr[smallest]) {
            	   smallest=j;
               }
			}
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}

}
