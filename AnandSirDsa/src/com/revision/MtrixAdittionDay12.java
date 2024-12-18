package com.revision;

public class MtrixAdittionDay12 {
	public static void main(String[] args) {
		int[][] matrixA = { { 1, 2, 3 }, { 4, 5, 6 } };

		int[][] matrixB = { { 7, 8, 9 }, { 10, 11, 12 } };

		if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
			System.out.println("Matrix dimensions do not match. Addition not possible.");
			return;
		}
		int result[][] = new int[matrixA.length][matrixB[0].length];
		 // Perform addition
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
		// Print result
		System.out.println("Resultant Matrix:");
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

}
