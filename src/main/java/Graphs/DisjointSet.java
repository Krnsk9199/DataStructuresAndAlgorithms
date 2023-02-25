package Graphs;

public class DisjointSet {

    int parent[] = new int [1000000];
    int rank[] = new int [1000000];
    public void makeSet(int n){
        for(int i =1; i<=n; i++){
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public int findParent(int node){
        if (node ==parent[node]){
            return node;
        }
        return parent[node] =  findParent(parent[node]);
    }

    void union(int u, int v){
        u = findParent(u);
        v = findParent(v);

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

    void main (){
        makeSet(10);
    }
}
