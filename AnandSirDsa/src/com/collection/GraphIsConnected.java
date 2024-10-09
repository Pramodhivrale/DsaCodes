package com.collection;

import java.util.ArrayList;

public class GraphIsConnected {
	static class Edge {
		int src;
		int dest;

		public Edge(int s, int d) {
			this.src = s;
			this.dest = d;
		}
	}

	public static void createGraph(ArrayList<Edge> graph[]) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<Edge>();
		}

		// Example of adding edges to the graph
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

	public static boolean isgraphConnected(ArrayList<Edge> grph[], int v) {

		boolean vis[] = new boolean[v];
		dfs(grph, 0, vis);
		for (int i = 0; i < v; i++) {
			if (!vis[i]) {
				return false;
			}
		}
		return true;

	}

	private static void dfs(ArrayList<Edge>[] grph, int current, boolean[] vis) {
		vis[current] = true;

		for (int i = 0; i < grph[current].size(); i++) {
			Edge edge = grph[current].get(i);
			if (!vis[edge.dest]) {
				dfs(grph, edge.dest, vis);
			}
		}

	}

	public static void main(String[] args) {
		int v = 7;
		ArrayList<Edge> grph[] = new ArrayList[v];
		createGraph(grph);
		boolean isgraphConnected = isgraphConnected(grph, v);
		if(isgraphConnected==true) {
			System.out.println("Graph is connected");
		}else {
			System.out.println("Graph is not-connected");
		}

	}

}
