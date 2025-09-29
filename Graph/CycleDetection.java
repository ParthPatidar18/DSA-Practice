//Implement Graph With AdjacencyList
package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class CycleDetection {
    static class Edge {
        //for unweigted graph
        int src;
        int dest;
        //for weighted graph 
        //int wt
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }        
    }
    public static void createGraph(ArrayList<Edge>graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<Edge>();
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

public static void bfs(ArrayList <Edge>graph[],int v,boolean vis[],int start){
    Queue <Integer>q=new LinkedList<>();
    //boolean vis[]=new boolean[v];
    q.add(start);
    while (!q.isEmpty()) {
        int curr=q.remove();
        if(vis[curr]==false){
            System.out.println(curr+" ");
            vis[curr]=true;
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e=graph[curr].get(i);
                q.add(e.dest);
            }
        }
    }
}

    public static void main(String[] args) {
        int v=4;
        ArrayList<Edge> graph[]=new ArrayList[v];
       
        createGraph(graph);
        boolean vis[]=new boolean[v];
        for (int i = 0; i < v; i++) {
            if (vis[i]==false) {
                bfs(graph,v,vis,i);
            }
        }
        
        // for (int i = 0; i < graph[2].size(); i++) {
        //    Edge e=graph[2].get(i);
        //     System.out.println(e.dest);
        // }
    }
}
