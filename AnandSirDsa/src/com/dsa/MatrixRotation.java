package com.dsa;

import java.util.Scanner;

public class MatrixRotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		int[][] rotatedMatrix = rotateMatrix(matrix);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(rotatedMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] rotateMatrix(int[][] matrix) {
		int n = matrix.length;
		int[][] rotatedMatrix = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				rotatedMatrix[j][n - i - 1] = matrix[i][j];
			}
		}

		return rotatedMatrix;
	}
}