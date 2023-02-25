package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
   import java.util.*;
    public class CycleDetectionInUndirected {

        public static void main(String[] args){

            Scanner s = new Scanner(System.in);
            int n = s.nextInt(); /// No of vertices
            int e = s.nextInt(); /// No of edges
            int edges[][] = new int[n][2];
            for (int i = 0; i < e; i++) {
                int v1 = s.nextInt();
                int v2 = s.nextInt();
              edges[i][0] = v1;
              edges[i][1] = v2;
            }
            System.out.println(cycleDetection(edges,n,e));
        }
        public static String cycleDetection(int[][] edges, int n, int m) {
            int transposeMatrix [][] = transpose(edges);
            int[][] adjMatrix = convertToAdjMatrix(n,transposeMatrix);
            boolean visited[] = new boolean[n+1];
            Arrays.fill(visited,false);
            for(int i =1; i<=n; i++){
                if(!visited[i]){
                    if(checkForCyle(i,-1,visited,adjMatrix)){
                        return "Yes";
                    }
                }
            }
            return "No";

        }

        public static boolean checkForCyle(int node, int parent,
                                           boolean[] visited, int[][] adjMatrix){
            visited[node] = true;
            ArrayList<Integer> adj = new ArrayList<>();
            for( int i =1; i<adjMatrix.length-1; i++){
                if(adjMatrix[node][i]==1){
                    adj.add(i);
                }
            }
            for(Integer i: adj){
                if(!visited[i]){
                    if(checkForCyle(node,i,visited,adjMatrix)){
                        return true;
                    }
                }
                else if (i!=parent){
                    return true;
                }
            }
            return false;
        }

        public static int[][] transpose(int adj[][]){
            int row = adj.length;
            int column = adj[0].length;
            int output[][] = new int[column][row];

            for (int i =0; i<column;i++){
                for(int j= 0; j<row; j++){
                    output[i][j] = adj[j][i];
                }
            }
            return output;

        }
        public static int[][] convertToAdjMatrix(int v,int edges[][]) {
            int adj[][] = new int[v][v];
            for(int i =0; i<edges.length;i++){
                int x = edges[i][0]; int y = edges[i][1];
                adj[x][y]=1;
                adj[y][x]=1;
            }

            return adj;
        }

    }

