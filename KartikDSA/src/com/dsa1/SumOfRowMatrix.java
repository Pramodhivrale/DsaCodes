package com.dsa1;
//COLUMN SUM
public class SumOfRowMatrix {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int rowlength = matrix.length;
		int colength = matrix[0].length;

		for (int i = 0; i < rowlength; i++) {

			int sum = 0;
			for (int j = 0; j < colength; j++) {
				sum = sum + matrix[i][j];
			}
			System.out.println(sum);
		}
		
	}

}
