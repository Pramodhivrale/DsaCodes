package com.revision;

// Sparse matrix checks if the half of the elements are grather than tha zero count
// if totalelements/2 = half elements are less than zero count then matrix is sparse
public class SparsMatrixDay12 {
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
		 
		 for(int i=0;i<=rows;i++) {
			 for(int j=0;j<=col;j++) {
				 zerocount++;
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
