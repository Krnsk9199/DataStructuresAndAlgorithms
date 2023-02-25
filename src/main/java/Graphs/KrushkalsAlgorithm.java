package Graphs;

import java.util.ArrayList;
import java.util.Collections;

public class KrushkalsAlgorithm {
    public static void main(String [] args){
        int n =5;
        ArrayList<Node> adj = new ArrayList<>();
        adj.add(new Node(0,1,2));
        adj.add(new Node(0,3,6));
        adj.add(new Node(1,3,8));
        adj.add(new Node(1,2,3));
        adj.add(new Node(2,4,7));
        KrusKalAlgo(adj,n);

    }

    public static int findParent(int node, int parent[]){
        if(node==parent[node]){
            return node;
        }
        return parent[node] = findParent(parent[node],parent);
    }
     static void union(int u, int v , int parent[], int rank[]){
        u = findParent(u,parent);
        v = findParent(v,parent);

        if(rank[u]<rank[v]){
            parent[u] = v;
        }
        else if (rank[v]<rank[u]){
            parent[v] =u;
        }
        else {
            parent[v]= u;
            rank[u]++;
        }

    }
    public static void KrusKalAlgo(ArrayList<Node> adj , int N ){
        Collections.sort(adj,new SortComparator());
        int parent [] = new int[N];
        int rank[] = new int[N];
        for (int i=0; i<N; i++){
            parent[i] =i;
            rank[i]=0;
        }
        int costMst = 0;
        ArrayList<Node> mst = new ArrayList<>();

        for(Node it: adj){
            if(findParent(it.getU(),parent)!=findParent(it.getV(),parent)){
                costMst+=it.getWeight();
                mst.add(it);
                union(it.getU(),it.getV(),parent,rank);
            }
        }
        System.out.println(costMst);
        for(Node it :mst){
            System.out.println(it.getU() + " "+ it.getV());
        }
    }

}
