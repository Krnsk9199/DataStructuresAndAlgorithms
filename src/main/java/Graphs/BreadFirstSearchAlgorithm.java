package Graphs;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;


/**
 *  1. Used for finding shortest Path.
 *  2. TimeComplexity is O(V+E)
 * */
public class BreadFirstSearchAlgorithm {
    static int[][] adj;

    // function to add edge to the graph
    static void addEdge(int x, int y)
    {
        adj[x][y] = 1;
        adj[y][x] = 1;
    }
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int v = s.nextInt(); /// No of vertices
        int e = s.nextInt(); /// No of edges

        adj = new int [v][v];
        addEdge(0,1);
        addEdge(1,2);
        addEdge(0,3);
        addEdge(2,3);
        bfTraversal(adj);
    }
    public static void bfTraversal(int adjMatrix[][]){

        boolean[] visited = new boolean[adjMatrix.length];
        Queue<Integer> pendingVertices = new LinkedList<Integer>();
        pendingVertices.add(0);
        visited[0] = true;
        while(!pendingVertices.isEmpty()){
            int currentVertex = pendingVertices.poll();
            System.out.print(currentVertex+" ");
            for(int i = 0; i<adjMatrix.length; i++){
                if(adjMatrix[currentVertex][i]==1 && !visited[i]){
                    visited[i] = true;
                    pendingVertices.add(i);
                }
            }
        }

    }

}
