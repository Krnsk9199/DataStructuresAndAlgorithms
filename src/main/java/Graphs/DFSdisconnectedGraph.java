package Graphs;
import java.util.*;
public class DFSdisconnectedGraph {


    public static void main(String[]args){
        int v = 6;
        int e = 5;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        for(int i =0;i <v; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j =0 ;j<v; i++){
                list.add(0);
            }
            edges.add(list);
        }
        addEdge(0,1,edges);
        addEdge(0,2,edges);
        addEdge(1,3,edges);
        addEdge(2,3,edges);
        addEdge(4,5,edges);

        ArrayList<ArrayList<Integer>> output = depthFirstSearch(v,e,edges);


    }

    public static void addEdge(int m ,int n, ArrayList<ArrayList<Integer>> edges){
        edges.set(m,edges.get(m)).set(n,1);
        edges.set(n,edges.get(n)).set(m,1);

    }
    public static ArrayList<ArrayList<Integer>> depthFirstSearch(int v, int e, ArrayList<ArrayList<Integer>> edges) {

        ArrayList<ArrayList<Integer>> output = new ArrayList<>();

        boolean visited [] = new boolean[v];
        for(int i = 0; i<v; i++){
            if(!visited[i]){
                ArrayList<Integer> list = new ArrayList<>();
                dfTraversal(edges,i,visited,list);
                output.add(list);
            }
        }

        return output;
    }
    public static void dfTraversal
            (  ArrayList<ArrayList<Integer>> adjMatrix,
               int currentVertex , boolean visited[], ArrayList<Integer> list) {
        visited[currentVertex] =true;
        list.add(currentVertex);
        for(int i =0; i<adjMatrix.size(); i++){
            if(adjMatrix.get(currentVertex).get(i)==1 && !visited[i]){
                dfTraversal(adjMatrix,i,visited,list);
            }
        }

    }
}
