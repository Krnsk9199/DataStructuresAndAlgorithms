package Graphs;

import java.util.Scanner;


/**
 * Depth-first search is an algorithm for traversing or searching tree or graph data structures.
 * The algorithm starts at the root node (selecting some arbitrary node
 * as the root node in the case of a graph)
 * and explores as far as possible along each branch before backtracking.
 */

/**
 *  1. Used for finding if path exists .
 *  2. TimeComplexity is O(V+E)
 * */
public class DepthFirstSearchAlgorithm {

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
//        int adjMatrix[][] = new int[n][n];
//        for (int i = 0; i < e; i++) {
//            int v1 = s.nextInt();
//            int v2 = s.nextInt();
//            adjMatrix[v1][v2] = 1;
//            adjMatrix[v2][v1] = 1;
//        }

        adj = new int [v][v];
        addEdge(0,1);
        addEdge(0,2);
        addEdge(0,3);
        dfTraversal(adj);
    }

    public static void dfTraversal( int adjMatrix[][]){

        boolean visited[] = new boolean[adjMatrix.length];
        dfTraversal(adjMatrix,0,visited);
    }

    public static void dfTraversal(int[][] adjMatrix, int currentVertex, boolean[] visited) {
        visited[currentVertex] = true;
        System.out.print(currentVertex+" ");
        for(int i= 0; i< adjMatrix.length; i++){
            if(adjMatrix[currentVertex][i]==1 && visited[i]==false){
                dfTraversal(adjMatrix, i, visited);
            }
        }
    }


}
