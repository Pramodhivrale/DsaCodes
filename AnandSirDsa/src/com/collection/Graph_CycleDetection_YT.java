package com.collection;

import java.util.ArrayList;

//CYCLE DETECTION - DIRECTED GRAPH
public class Graph_CycleDetection_YT {
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
		graph[0].add(new Edge(0, 2));

		graph[1].add(new Edge(1, 0));

		graph[2].add(new Edge(2, 3));

		graph[3].add(new Edge(3, 0));

	}

	public static boolean isCycleDetected(ArrayList<Edge> graph[], boolean visted[], int curr, boolean rec[]) {
		visted[curr] = true;
		rec[curr] = true;

		for (int i = 0; i < graph[curr].size(); i++) {
			Edge edge = graph[curr].get(i);
			if (rec[edge.dest]) {
				return true;
			} else if (!visted[edge.dest]) {
				if (isCycleDetected(graph, visted, edge.dest, rec)) {
					return true;
				}
			}
		}

		rec[curr] = false;
		return false;
	}

	public static void main(String[] args) {
		int v = 4;
		ArrayList<Edge> graph[] = new ArrayList[v];
		createGraph(graph);

		boolean vis[] = new boolean[v];
		boolean rec[] = new boolean[v];

		for (int i = 0; i < v; i++) {
			if (!vis[i]) {
				boolean cycleDetected = isCycleDetected(graph, vis, 0, rec);
				if (cycleDetected) {
					System.out.println(cycleDetected);
					break;
				}
			}
		}

		//boolean cycleDetected = isCycleDetected(graph, new boolean[v], 0, new boolean[v]);
		//System.out.println(cycleDetected);

	}

}
