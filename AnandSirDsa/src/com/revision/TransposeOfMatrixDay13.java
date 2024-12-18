package com.revision;

public class TransposeOfMatrixDay13 {
	public static void main(String[] args) {
		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] transpose = new int[A.length][A[0].length];

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				transpose[j][i] = A[i][j];
			}
		}
		for (int i = 0; i < transpose.length; i++) {
			for (int j = 0; j < transpose[0].length; j++) {
                 System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
	}
}
