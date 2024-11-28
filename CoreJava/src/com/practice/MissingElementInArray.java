package com.practice;

public class MissingElementInArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 6, 7, 8, 9 };
		
		for(int i=1;i<arr.length;i++) {
			boolean flag=false;
			
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==i) {
					flag=true;
					break;
				}
			}
			if(flag==false) {
				System.out.println("Missing number :"+i);
			}
		}
		
	}

}
