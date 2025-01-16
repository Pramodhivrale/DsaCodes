package com.revision;

public class SubsetDay22 {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5};
		int totalsubset = 1 << arr.length;

		for (int i = 0; i < totalsubset; i++) {
			String subset = "";
			for (int j = 0; j < arr.length; j++) {
				if ((i & (1 << j)) > 0) {

					subset = subset + arr[j]+" ";
				}
			}
			System.out.println(subset+" ");
		}
	}

}
