package com.revision;

public class MatrixKeyDay55 {
	public static void main(String[] args) {
		int[][] mat = { { 1, 3, 5 }, { 7, 10, 12 }, { 14, 17, 20 } };
		int key = 10;
		if(m1(mat, key)) {
			System.out.println();
		}
		
	}

	static boolean m1(int mat[][], int key) {
		int n = mat.length;
		int m = mat[0].length;

		int low = 0;
		int high = n * m - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			int r = mid / m;
			int c = mid % m;
			if (mat[r][c] > key) {
				high = mid - 1;
			} else if (mat[r][c] < key) {
				low = mid + 1;
			} else {
				return true;
			}

		}
		return false;
	}

}
