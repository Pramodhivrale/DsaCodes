package com.revision;

public class Un {
public static void main(String[] args) {
	int arr[]= {2,3,2,3,4};
	
	for(int i=0;i<arr.length;i++) {
		int count=0;
		int key=arr[i];
		for(int j=0;j<arr.length;j++) {
			if(key==arr[j]) {
				count++;
			}
		}
		if(count==1) {
			System.out.println(arr[i]);
		}
	}
}
}
