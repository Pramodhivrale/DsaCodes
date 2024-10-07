package com.collection;

import java.util.ArrayList;
import java.util.Stack;

public class KosarajusAlgoritham {
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
		graph[0].add(new Edge(0, 2));
		graph[0].add(new Edge(0, 3));

		graph[1].add(new Edge(1, 0));

		graph[2].add(new Edge(2, 1));
		graph[3].add(new Edge(3, 4));

	}

	public static void kosarahuAlgo(ArrayList<Edge> graph[], int v) {
		// step-1
		Stack<Integer> s = new Stack<Integer>();
		boolean[] vis = new boolean[v];
		for (int i = 0; i < v; i++) {
			if (!vis[i]) {
				topSort(graph, i, vis, s);
			}
		}

		// step-2
		ArrayList<Edge> transpose[] = new ArrayList[v];
		for (int i = 0; i < graph.length; i++) {
			vis[i]=false;
			transpose[i] = new ArrayList<Edge>();
		}

		for (int i = 0; i < v; i++) {
			for (int j = 0; j < graph[i].size(); j++) {
				Edge e = graph[i].get(j);// e.src(i) -> e.dest
				transpose[e.dest].add(new Edge(e.dest, e.src));

			}
		}
		
		//step-3
		while (!s.isEmpty()) {
			int curr=s.pop();
			if(!vis[curr]) {
				dfs(graph, curr, vis);
			}
			System.out.println();
		}
		
	}
	
	public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis) {
		vis[curr]=true;
		System.out.println(curr+" ");
		for(int i=0;i<graph[curr].size();i++) {
			Edge e = graph[i].get(i);
			if(!vis[e.dest]) {
				dfs(graph, e.dest, vis);
			}
		}
	}

	private static void topSort(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> s) {
		vis[curr] = true;
		for (int i = 0; i < graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			if (!vis[e.dest]) {
				topSort(graph, e.dest, vis, s);
			}
		}
		s.push(curr);
	}

	public static void main(String[] args) {
		int v = 5;

		ArrayList<Edge> graph[] = new ArrayList[v];
		createGraph(graph);
	}

}
