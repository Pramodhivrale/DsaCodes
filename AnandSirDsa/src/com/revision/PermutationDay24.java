package com.revision;

public class PermutationDay24 {
	public static void main(String[] args) {

		int arr[] = new int[9];// array to store permutations
		boolean taken[] = new boolean[10];// Keep track of used numbers (1-9)
		int pos = 0;
		solve(arr, pos, taken);

	}

	private static void solve(int[] arr, int pos, boolean[] taken) {
		if (pos == 9) {
			if (checkMagicSquere(arr) == true) {

			}
		}
		for (int i = 1; i <= 9; i++) {
			if (taken[i] == false) {
				arr[pos] = i;
				taken[i] = true;
				solve(arr, pos + 1, taken);
				taken[i] = false;// Backtrack: unmark the number
			}
		}
	}

	private static boolean checkMagicSquere(int[] arr) {
		// Magic constant for a 3x3 magic square
		// For a 3 *3 magic squere the magic constant will always be 15
		// it's a mathematically determined property.
		int magicConstant = 15;

		// Convert 1D array into 3D array
		int array[][] = { { arr[0], arr[1], arr[2] }, { arr[3], arr[4], arr[5] }, { arr[6], arr[7], arr[8] }

		};

		// // Row wise sum
		for (int i = 0; i < array.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < array[0].length; j++) {
				rowSum = rowSum + array[i][j];

			}
			if (rowSum != magicConstant) {
				return false;
			}

		}
		// Columen sum
		for (int i = 0; i < array[0].length; i++) {
			int sum = 0;
			for (int j = 0; j < array.length; j++) {
				sum += array[i][j];
			}
			if (sum != magicConstant) {
				return false;
			}
		}
		int diagonal1 = array[0][0] + array[1][1] + array[2][2];
		int diagonal2 = array[0][2] + array[1][1] + array[2][0];
		if (diagonal1 != magicConstant || diagonal2 != magicConstant) {
			return false;
		}
		return true;
	}

}
