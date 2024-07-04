package com.data;

import java.util.HashSet;
import java.util.Iterator;

public class DuplicateFormArray2 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,1,3};

		int array[] = new int[arr.length];

		for (int i = 0; i <= arr.length - 1; i++) {

			int key = arr[i];
			int count = 0;
			for (int j = 1 + i; j <= arr.length - 1; j++) {
				if (arr[j] == key) {
					count++;
				}
			}
			if (count > 0) {
				for (int a = i; a <= arr.length - 1; a++) {
					array[i] = key;
				}
				//System.out.println(key);
			}
		}
		HashSet<Integer> hash=new HashSet<Integer>();
		for(int element : array) {
			if(element != 0) {
				hash.add(element);
			}
		}
		Iterator<Integer> iterator = hash.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
	
	
	

}






