package com.dsa1;

public class SymetricMatrix 
{

	public static void main(String[] args) {
		int[][] matrix = {
				 {1, 2, 3},
				 {4, 5, 6},
				 {7, 8, 9}
	        };
		
		if(isSymetric(matrix)) {
			System.out.println("Transpose Matrix");
		}
		else {
			System.out.println("Not Transpose");
		}
	}

	private static boolean isSymetric(int[][] matrix) {
		for(int i=0;i<=matrix.length-1;i++) {
			for(int j=0;j<=matrix[0].length-1;j++) {
				if(matrix[i][j] != matrix[j][i]) {
					return false;
				}
			}
		}
		return true;
	}

}
