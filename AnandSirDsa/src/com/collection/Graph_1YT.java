package com.collection;

//Adjacency List // UN-WEIGHTED
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_1YT {
	static class Edge {
		int src;
		int dest;

		public Edge(int s, int d) {
			this.src = s;
			this.dest = d;
		}
	}
	public static void createGraph(ArrayList<Edge> graph[]) {
		for(int i=0;i<graph.length;i++) {
			graph[i]=new ArrayList<Edge>();
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
	// Depth-First Search (DFS)
	public static void dfs(ArrayList<Edge> graph[],int current,boolean visted[]) {
		System.out.println(current+" ");
		visted[current]=true;
		for(int i=0;i<graph[current].size();i++) {
			Edge e=graph[current].get(i);
			if(visted[e.dest]==false)
			dfs(graph, e.dest, visted);
		}
	}
	//ALL PATHS FROM SOURCE TO DESTENATION  O(V^V9)
	public static void sourceToPath(ArrayList<Edge> graph[],boolean vis[],int curr,String path,int tar) {
		if(curr==tar) {
			System.out.println(path);
			return;
		}
		for(int i=0;i<graph[curr].size();i++) {
			Edge e=graph[curr].get(i);
			if(!vis[e.dest]) {
				vis[curr]=true;
				sourceToPath(graph, vis, e.dest, path+e.dest, tar);
				vis[curr]=false;
			}
		}
	}
	

	//BREADTH-FIRST SEARCH - (BFS)
	public static void bfs(ArrayList<Edge> graph[],int v) {
		Queue<Integer> q=new LinkedList<Integer>();
		boolean visit[]=new boolean[v];
		
		q.add(0);
		while (!q.isEmpty()) {
			int current = q.remove();
			if(visit[current]==false) {
				System.out.println(current+" ");
				visit[current]=true;
				
				for(int i=0;i<graph[current].size();i++) {
					Edge e=graph[current].get(i);
					
					q.add(e.dest);
				}
			}
		}
	}

	public static void main(String[] args) {
     int v=7;
     ArrayList<Edge> graph[]=new ArrayList[v];
     createGraph(graph);
     int src=0,tar=5;
     sourceToPath(graph, new boolean[v], src, "0", tar);
//     bfs(graph, v);
//     System.out.println();
//     boolean vis[]=new boolean[v];
//     dfs(graph,0, vis);
//     System.out.println();
     
     
     //PRINT NAGAIBOURS OF-2
//     for(int i=0;i<graph[2].size();i++) {
//    	 Edge e=graph[2].get(i);
//    	 System.out.println(e.dest);
//     }
	}
}
