package com.collection;

import java.util.ArrayList;

public class ArticulationPoint {
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
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, int par, int dt[], int low[], boolean vis[], int[] time,
            boolean ap[]) {

        vis[curr] = true;
        dt[curr] = low[curr] = ++time[0]; // Increment time as an array to pass by reference
        int children = 0;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            int neigh = e.dest;

            if (par == neigh) {
                continue; // Skip the parent
            } else if (vis[neigh]) {
                low[curr] = Math.min(low[curr], dt[neigh]); // Update low value if already visited
            } else {
                dfs(graph, neigh, curr, dt, low, vis, time, ap); // Recur for the neighbor
                low[curr] = Math.min(low[curr], low[neigh]); // Update low value for the current node
                if (dt[curr] <= low[neigh] && par != -1) {
                    ap[curr] = true; // Current is an articulation point
                }
                children++; // Increment children count
            }
        }
        if (par == -1 && children > 1) {
            ap[curr] = true; // Special case for root
        }
    }

    public static void getArticulation(ArrayList<Edge> graph[], int v) {
        int dt[] = new int[v];
        int low[] = new int[v];
        int[] time = {0}; // Using an array to keep track of time
        boolean vis[] = new boolean[v];
        boolean ap[] = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!vis[i]) { // Only call DFS for unvisited nodes
                dfs(graph, i, -1, dt, low, vis, time, ap);
            }
        }
        for (int i = 0; i < v; i++) {
            if (ap[i]) {
                System.out.println("Articulation Point: " + i);
            }
        }
    }

    public static void main(String[] args) {
        int v = 5; // Number of vertices
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        System.out.println("Finding articulation points in the graph:");
        getArticulation(graph, v);
    }
}
