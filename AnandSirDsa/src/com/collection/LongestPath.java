package com.collection;

import java.util.ArrayList;

public class LongestPath {
	static class Edge {
		int src;
		int dest;

		public Edge(int s, int d) {
			this.src = s;
			this.dest = d;
		}
	}

	// Create the graph
	public static void createGraph(ArrayList<Edge> graph[]) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<Edge>();
		}
		graph[0].add(new Edge(0, 1));
		graph[0].add(new Edge(0, 2));

		graph[1].add(new Edge(1, 0));
		graph[1].add(new Edge(1, 3));

		graph[2].add(new Edge(2, 0));
		graph[2].add(new Edge(2, 4));

		graph[3].add(new Edge(3, 1));
		graph[3].add(new Edge(3, 4));
		graph[3].add(new Edge(3, 5));

		graph[4].add(new Edge(4, 2));
		graph[4].add(new Edge(4, 3));
		graph[4].add(new Edge(4, 5));

		graph[5].add(new Edge(5, 3));
		graph[5].add(new Edge(5, 4));
		graph[5].add(new Edge(5, 6));

		graph[6].add(new Edge(6, 5));
	}

	// Find the longest path using DFS
	public static int findLongestPath(ArrayList<Edge> graph[], int current, boolean visited[], int length) {
		visited[current] = true;
		int maxLength = length;

		for (int i = 0; i < graph[current].size(); i++) {
			Edge e = graph[current].get(i);
			if (!visited[e.dest]) {
				int pathLength = findLongestPath(graph, e.dest, visited, length + 1);
				maxLength = Math.max(maxLength, pathLength);
			}
		}

		visited[current] = false;

		return maxLength;
	}

	public static void main(String[] args) {
		int v = 7;
		ArrayList<Edge> graph[] = new ArrayList[v];
		createGraph(graph);

		// Start from any node (0 in this case)
		boolean visited[] = new boolean[v];
		int longestPath = findLongestPath(graph, 0, visited, 0);

		System.out.println("The longest path length in the graph is: " + longestPath);
	}

}
