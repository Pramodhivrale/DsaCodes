package com.dsa1;

public class RotateMatrix90 {
	public static void main(String[] args) {
		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
               // ClockWise
		for (int i = 0; i <= A.length - 1; i++) {
			for (int j = A[0].length - 1; j >= 0; j--) {
				System.out.print(A[j][i] + " ");
			}
			System.out.println();
		}
		//Anti-Clockwise
		for (int i = A.length-1; i >=0; i--) {
			for (int j = 0; j <=A[0].length-1; j++) {
				System.out.print(A[j][i] + " ");
			}
			System.out.println();
		}
		
		

	}

}
