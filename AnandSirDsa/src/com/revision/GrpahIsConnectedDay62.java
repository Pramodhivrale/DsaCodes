package com.revision;

import java.util.ArrayList;

public class GrpahIsConnectedDay62 {
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
		if(isgraphconnected(graph,v)) {
			System.out.println("Connected");
		}else {
			System.out.println("No");
		}
	}

	public static boolean isgraphconnected(ArrayList<Edge>[] graph, int v) {
		
		boolean vis[]=new boolean[v];
		dfs(graph, vis, 0);
		for(int i=0;i<v;i++) {
			if(vis[i]==false) {
				return false;
			}
		}
		return true;
	}

	public static void dfs(ArrayList<Edge>[] graph, boolean[] visted, int current) {
		visted[current]=true;
		System.out.println(current+" ");
		for(int i=0;i<graph[current].size();i++) {
			Edge e=graph[current].get(i);
			if(visted[e.dest]==false) {
				dfs(graph,visted,e.dest);
			}
		}
		
	}

	public static void createGraph(ArrayList<Edge>[] graph) {
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
