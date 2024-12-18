package com.revision;

public class ColumnWiseSumDay12 {
	public static void main(String[] args) {
		int[][] matrix = { 
				{ 1, 1, 1, 1, 1 }, 
				{ 0, 5, 0, 0, 0 }, 
				{ 0, 4, 0, 5, 0 }, 
				{ 0, 0, 0, 8, 0 },
				{ 0, 2, 0, 0, 0 } };

		int col = matrix[0].length;
		for (int i = 0; i <= matrix.length - 1; i++) {
			int sum = 0;
			for (int j = 0; j <= col - 1; j++) {
				sum = sum + matrix[i][j];
			}
			System.out.println(i+"th Column :"+sum);
		}
	}
}
