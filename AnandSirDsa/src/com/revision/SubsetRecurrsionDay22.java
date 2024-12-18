package com.revision;

import java.util.ArrayList;
import java.util.List;

public class SubsetRecurrsionDay22 {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5 };
		List<Integer> list = new ArrayList<Integer>();
		int index = 0;
		genrateSubset(arr, index, list);
	}

	private static void genrateSubset(int[] arr, int index, List<Integer> list) {
		// Base case: If we reach the end of the array, print the subset
		if (index == arr.length) {
			System.out.println(list);
			return;
		}

		// Case 1: Exclude the current element
		genrateSubset(arr, index + 1, list);

		 // Case 2: Include the current element
		list.add(arr[index]);
		genrateSubset(arr, index + 1, list);

        // Backtrack to remove the current element before returning
		list.remove(list.size() - 1);

	}
}
