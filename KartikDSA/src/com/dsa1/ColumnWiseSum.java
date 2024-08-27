package com.dsa1;

public class ColumnWiseSum 
{
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int rowlength = matrix.length;
		int colength = matrix[0].length;
		
		for(int j=0;j<=colength-1;j++) {
			int sum=0;
			for(int i=0;i<=rowlength-1;i++) {
				sum=sum+matrix[i][j];
			}
			System.out.println(sum);
		}
	}

}
