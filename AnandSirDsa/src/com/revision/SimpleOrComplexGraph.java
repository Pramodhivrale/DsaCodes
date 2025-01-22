package com.revision;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SimpleOrComplexGraph {
	static class Edge {
		int src;
		int dest;

		public Edge(int s, int d) {
			this.src = s;
			this.dest = d;
		}
	}

	public static void main(String[] args) {
		int v = 7;
		ArrayList<Edge> graph[] = new ArrayList[v];
		createGraph(graph);
		printgraph(graph);
		if (simpleOrComplexGraph(graph)) {
			System.out.println("The graph is simple.");
		} else {
			System.out.println("The graph is complex.");
		}
		//DFS
		boolean vis[] = new boolean[v];
		depthFirstSeacrch(graph, 0, vis);
		System.out.println();
		//BFS
		bfs(graph, v);
	}

	public static void bfs(ArrayList<Edge>[] graph, int v) {
		Queue<Integer> q = new LinkedList<Integer>();
		boolean visted[] = new boolean[v];
		q.add(0);
		while (!q.isEmpty()) {
			int current = q.remove();
			if (visted[current] == false) {
				System.out.println("BFS :" + current + " ");
				visted[current] = true;
				for (int i = 0; i < graph[current].size(); i++) {
					Edge e = graph[current].get(i);
					q.add(e.dest);
				}
			}
		}
	}

	public static void depthFirstSeacrch(ArrayList<Edge>[] graph, int curent, boolean[] vis) {
		// 1.Add element in boolean and make it true
		// 2. Current element is visted
		// 3.find the neaigebours of current element
		// 4.check neaigoubers are visted or not
		// 5.if not visted then make recuresive call
		System.out.println("DFS :"+curent + " ");
		vis[curent] = true;
		for (int i = 0; i < graph[curent].size(); i++) {
			Edge e = graph[curent].get(i);
			if (vis[e.dest] == false) {
				depthFirstSeacrch(graph, e.dest, vis);
			}
		}
	}

	public static void printgraph(ArrayList<Edge>[] graph) {
		for (int i = 0; i < graph[2].size(); i++) {
			Edge e = graph[2].get(i);
			System.out.println(e.dest + "");
		}
	}

	public static boolean simpleOrComplexGraph(ArrayList<Edge>[] graph) {
		boolean visited[][] = new boolean[graph.length][graph.length];
		for (int i = 0; i < graph.length; i++) {
			for (Edge edge : graph[i]) {
				if (edge.src == edge.dest) {
					System.out.println("Self-loop detected at vertex: " + edge.src);
					return false;
				}
				if (visited[edge.src][edge.dest]) {
					System.out.println("Parallel edge detected between: " + edge.src + " and " + edge.dest);
					return false;
				}
				visited[edge.src][edge.dest] = true;
				visited[edge.dest][edge.src] = true;
			}
		}
		return false;

	}

	public static void createGraph(ArrayList<Edge>[] graph) {
		// Create Empty list in the place of null values
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

}
