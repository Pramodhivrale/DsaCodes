package com.dsa1;

public class TowerOfHonei {
	public static void toh(int n, char src, char dest, char temp) {

		if(n==0) {
			return;
		}
		toh(n-1, src, temp, dest);
		 System.out.println("Move disk " + n + " from " + src + " to " + dest);
		toh(n-1, temp, dest, src);
	}

	public static void main(String[] args) {
		int n=4;
        toh(n, 'A', 'B', 'C');
	}

}
