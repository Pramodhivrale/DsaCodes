package com.revision;

public class HeapDay70 {
	public static void main(String[] args) {
		int arr[] = { 50, 30, 40, 10, 5, 20, 30, 60, 45 };
		int value=70;
		insert(arr,arr.length,value);
	}

	public static void insert(int[] arr, int n,int value) {
		if (n + 1 >= arr.length) {
	        System.out.println("Heap is full! Cannot insert value: " + value);
	        return;
	    }
		n=n+1;
		arr[n]=value;
		int i=n;
		while (i>1) {
			int parent=i/2;
			if(arr[parent] < arr[i]) {
				swap(arr,parent,i);
				i=parent;
			}
			else {
				return;
			}
		}
		
	}

	public static void swap(int[] arr, int i, int j) {
       		int temp=arr[i];
       		arr[i]=arr[j];
       		arr[j]=temp;
	}

}
