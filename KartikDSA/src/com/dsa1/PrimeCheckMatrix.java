package com.dsa1;

public class PrimeCheckMatrix {

	public static void main(String[] args) {
		int[][] A = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
	    int sum=0;
		for(int i=0;i<=A.length-1;i++) {
			for(int j=0;j<=A[0].length-1;j++) {
				if(isPrime(A[i][j])) {
					 sum += A[i][j];
				}
				
			}
			
		}
		System.out.println(sum);
	}

	private static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		for(int k=2;k*k<=n;k++) {
			if(n % k == 0) {
				return false;
			}
		}
		return true;
	}
}
