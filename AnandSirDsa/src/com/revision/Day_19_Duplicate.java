package com.revision;

import java.util.ArrayList;
import java.util.List;
// Brute-force approche
public class Day_19_Duplicate {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 4, 5, 1, 2, 2, 4 };
		List<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == key) {
					count++;
				}
			}
			if (count > 0) {
				boolean flag = true;
				for (int k = 0; k < al.size(); k++) {
					if (al.get(k).equals(key)) {
                      flag=false;
					}
				}
				if(flag==true) {
					System.out.println(key);
				}
				al.add(key);
			}
		}
	}

}
