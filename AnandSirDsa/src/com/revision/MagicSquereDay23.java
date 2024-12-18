package com.revision;

public class MagicSquereDay23 {
	public static void main(String[] args) {
		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] B = { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };

		int cos = cos(A, B);
		System.out.println(cos);

	}

	private static int cos(int[][] a, int[][] b) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				sum = sum + Math.abs(a[i][j] - b[i][j]);
			}
		}
		return sum;

	}
}
