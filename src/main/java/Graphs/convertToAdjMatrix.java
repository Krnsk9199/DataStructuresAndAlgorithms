package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class convertToAdjMatrix {
    public static int[][] convertToAdjMatrix(int v,int edges[][]) {
        int adj[][] = new int[v][v];
        for(int i =0; i<edges.length;i++){
            adj[edges[i][0]][edges[i][1]]=1;
            adj[edges[i][1]][edges[i][0]]=1;
        }

        return adj;

    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        int e = s.nextInt();
        int edges [][] = new int[e][2];

        for(int i =0; i<e; i++){
            edges[i][0] = s.nextInt();
            edges[i][1] = s.nextInt();
        }


        System.out.println();
        int [][] adjMatrix = convertToAdjMatrix(v,edges);
        for(int i =0; i<adjMatrix.length; i++){
            for(int j =0 ; j<adjMatrix[i].length; j++){
                System.out.print(adjMatrix[i][j]);
            }
            System.out.println();

        }
        ArrayList<Integer> output = bfTraversal(adjMatrix);
    }

    public static ArrayList<Integer> bfTraversal(int adjMatrix[][]){

        ArrayList<Integer> output = new ArrayList<>();
        boolean[] visited = new boolean[adjMatrix.length];
        Queue<Integer> pendingVertices = new LinkedList<Integer>();
        pendingVertices.add(0);
        visited[0] = true;
        while(!pendingVertices.isEmpty()){
            int currentVertex = pendingVertices.poll();
            output.add(currentVertex);
            for(int i = 0; i<adjMatrix.length; i++){
                if(adjMatrix[currentVertex][i]==1 && !visited[i]){
                    visited[i] = true;
                    pendingVertices.add(i);
                }
            }
        }
        return output;

    }
}
