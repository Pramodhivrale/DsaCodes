package com.collection;

import java.util.ArrayList;
import java.util.Stack;

public class Graph_TopologiclSort_YT {
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
		graph[2].add(new Edge(2, 3));

		graph[3].add(new Edge(3, 2));

		graph[4].add(new Edge(4, 0));
		graph[4].add(new Edge(4, 1));

		graph[5].add(new Edge(5, 0));
		graph[5].add(new Edge(5, 2));
	}

	public static void topSortUtil(ArrayList<Edge> graph[], int curr, boolean visted[], Stack<Integer> stack) {
		visted[curr] = true;
		for (int i = 0; i < graph[curr].size(); i++) {
			Edge edge = graph[curr].get(i);
			if (!visted[edge.dest]) {
				topSortUtil(graph, edge.dest, visted, stack);
			}
		}
		stack.push(curr);
	}

	public static void topSort(ArrayList<Edge> graph[], int v) {
		boolean vis[] = new boolean[v];

		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < v; i++) {
			if (!vis[i]) {
				topSortUtil(graph, i, vis, stack);
			}

		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop() + " ");
		}
	}

	public static void main(String[] args) {
		int v = 6;
		ArrayList<Edge> grap[] = new ArrayList[v];
		createGraph(grap);
		topSort(grap, v);
	}
}
