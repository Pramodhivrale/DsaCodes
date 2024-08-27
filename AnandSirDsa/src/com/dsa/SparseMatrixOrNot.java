package com.dsa;

//To check whether the given matrix is the sparse matrix or not, 
//we first count the number of zero elements present in the matrix. 
//Then calculate the size of the matrix. For the matrix to be sparse, 
//count of zero elements present in an array must be greater than size/2.

public class SparseMatrixOrNot 
{
	public static void main(String[] args) {
		
		 int[][] matrix = {
	                {0, 0, 0, 0, 0},
	                {0, 5, 0, 0, 0},
	                {0, 0, 0, 0, 0},
	                {0, 0, 0, 8, 0},
	                {0, 0, 0, 0, 0}
	        };
		 
		 int rows=matrix.length;
		 int col=matrix[0].length;
		 int zerocount=0;
		 
		 for(int i=0;i<rows;i++) {
			 for(int j=0;j<col;j++) {
				 if(matrix[i][j]==0) {
					 zerocount++;
				 }
			 }
		 }
		 
		 int totalElements = rows * col;
		 int halfElements = totalElements / 2;
		 
		 if(zerocount > halfElements) {
			 System.out.println("Matriz is sparse");
		 }
		 else {
			System.out.println("No");
		}
	}

}
