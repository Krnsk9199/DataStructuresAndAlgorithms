package Graphs;

import java.util.Scanner;

public class AdjacencyMatrixImplementation {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); /// No of vertices
        int e = s.nextInt(); /// No of edges
        int adjMatrix[][] = new int[n][n];
        for (int i = 0; i < e; i++) {
            int v1 = s.nextInt();
            int v2 = s.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }
    }
}
