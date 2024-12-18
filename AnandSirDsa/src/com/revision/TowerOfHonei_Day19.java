package com.revision;

public class TowerOfHonei_Day19 {
	public static void main(String[] args) {
		int n = 3;
		char source = 'A';
		char auxaliry = 'B';
		char destination = 'C';
		towerOfHonei(n, source, auxaliry, destination);
	}

	private static void towerOfHonei(int n, char source, char auxaliry, char destination) {
		if (n == 1) {
			System.out.println("Move disk 1 from " + source + " to " + destination);
			return;
		}

		towerOfHonei(n - 1, source, destination, auxaliry);

		System.out.println("Move disk " + n + " from " + source + " to " + destination);
		
		towerOfHonei(n-1, auxaliry, source, destination);
		

	}

}
