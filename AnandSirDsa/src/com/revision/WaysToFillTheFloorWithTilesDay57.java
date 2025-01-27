package com.revision;

import java.util.Scanner;

public class WaysToFillTheFloorWithTilesDay57 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input floor size and tile size
		System.out.print("Enter the floor length (n): ");
		int n = scanner.nextInt();

		System.out.print("Enter the tile size (m): ");
		int m = scanner.nextInt();

		// Calculate the number of ways
		int result = countWaysToTileFloor(n, m);

		// Output the result
		System.out.println("Number of ways to tile the floor: " + result);
		scanner.close();
	}

	private static int countWaysToTileFloor(int n, int m) {
		if(n<m) {
			return 1;
		}
	     int dp[]=new int[n+1];
	     for(int i=0;i<m;i++) {
	    	 dp[i]=1; // Only one way to tile floors smaller than the tile size
	     }
	     for(int i=m;i<=n;i++) {
	    	 dp[i]=dp[i-1]+dp[i-m];// Place tile horizontally or vertically
	     }
		return dp[n];
	}

}
