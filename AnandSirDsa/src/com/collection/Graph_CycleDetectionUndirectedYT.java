package com.collection;

import java.util.ArrayList;

//CYCLE DETECTION IN UNDIRECTED GRAPH
public class Graph_CycleDetectionUndirectedYT {
	static class Edge {
		int src;
		int dest;

		public Edge(int s, int d) {
			this.src = s;
			this.dest = d;
		}
	}

	// DFS
	private static void createGraph(ArrayList<Edge>[] graph) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<Edge>();
		}
		graph[0].add(new Edge(0, 1));
		graph[0].add(new Edge(0, 4));

		graph[1].add(new Edge(1, 0));
		graph[1].add(new Edge(1, 2));
		//graph[1].add(new Edge(1, 4));

		graph[2].add(new Edge(2, 1));
		graph[2].add(new Edge(2, 3));

		graph[3].add(new Edge(3, 2));

		graph[4].add(new Edge(4, 0));
		//graph[4].add(new Edge(4, 1));
		graph[4].add(new Edge(4, 5));

		graph[5].add(new Edge(5, 4));

	}
    // Day 62 - Anand sir
	public static boolean isCycleUndirected(ArrayList<Edge> graph[], boolean visted[], int curr, int parent) {
		visted[curr] = true;
		for (int i = 0; i < graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			if (visted[e.dest] && e.dest != parent) {
				return true;
			} else if (!visted[e.dest]) {
				if (isCycleUndirected(graph, visted, e.dest, curr)) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int v = 6;
		ArrayList<Edge> graph[] = new ArrayList[v];
		createGraph(graph);

		System.out.println(isCycleUndirected(graph, new boolean[v], 0, -1));

	}

}
