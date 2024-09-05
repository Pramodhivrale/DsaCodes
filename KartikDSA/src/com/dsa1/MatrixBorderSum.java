package com.dsa1;

public class MatrixBorderSum 
{
	public static void main(String[] args) {
		int[][] matrix = {
	            {1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {9, 10, 11, 12},
	            {13, 14, 15, 16}
	        };
		
		int row=matrix.length;
		int col=matrix[0].length;
		int sum=0;
		for(int i=0;i<=row-1;i++) {
			for(int j=0;j<=col-1;j++) {
				if(i ==0 || i == row-1 || j== 0 || j == row-1 ) {
					if(matrix[i][j] % 2 != 0) {
						sum=sum+matrix[i][j];
					}
				}
			}
		}
		System.out.println("Total sum :"+sum);
	}

}
