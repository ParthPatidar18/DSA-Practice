//Implement Graph With AdjacencyList
package Graph;

import java.util.ArrayList;

public class CycleDetection {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Graph creation
    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

    // Cycle detection (undirected graph)
    public static boolean detectcycle(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (detectcycleutil(graph, vis, i, -1)) {
                    return true; // cycle found
                }
            }
        }
        return false;
    }

    // DFS utility
    public static boolean detectcycleutil(ArrayList<Edge> graph[], boolean vis[], int curr, int par) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            // Case 1: If neighbor not visited → DFS
            if (!vis[e.dest]) {
                if (detectcycleutil(graph, vis, e.dest, curr)) {
                    return true;
                }
            }
            // Case 2: If neighbor is visited and not parent → cycle
            else if (e.dest != par) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);
        System.out.println(detectcycle(graph)); // true (cycle exists)
    }
}
