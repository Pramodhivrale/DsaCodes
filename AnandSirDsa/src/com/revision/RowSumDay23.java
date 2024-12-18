package com.revision;

public class RowSumDay23 {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int rowlenght = matrix.length;
		int column = matrix[0].length;
		for (int i = 0; i < rowlenght; i++) {
			int sum=0;
          for(int j=0;j<column;j++) {
        	  sum=sum+matrix[j][i];
          }
          System.out.println(sum);
		}

	}

}
