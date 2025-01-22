package com.revision;

public class CenterOfTheGraphDay54 {
	public static void main(String[] args) {
		int[][] edges = { { 1, 3 }, { 2, 3 }, { 3, 4 }, { 3, 5 } };
		System.out.println("Center of the Star Graph: " + findCenter(edges));
	}

	private static int findCenter(int[][] edges) {

		if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
			return edges[0][0];
		}
		return edges[0][1];
	}

}
