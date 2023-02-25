package Graphs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


class NodeK
{
    private int v;
    private int weight;

    NodeK(){}
    NodeK(int _v, int _w){v=_v; weight = _w; }

    int getV(){return v; }
    int getWeight(){return weight; }

}

public class DijkstrasAlgo {
    public static ArrayList<ArrayList<NodeK>> convertToAdj(
            ArrayList<ArrayList<Integer>> graph , int n){
        ArrayList<ArrayList<NodeK>> adj = new ArrayList<>();
        for(int i =0; i<n; i++){
            ArrayList<NodeK> node = new ArrayList<>();
            adj.add(node);
        }
        for(int i =0 ;i<n; i++){
            for(int j = 0; j<n; j++){
                if(graph.get(j).get(0)==i){
                    NodeK node1 = new NodeK(graph.get(j).get(1), graph.get(j).get(2));
                    NodeK node2 = new NodeK(graph.get(j).get(0), graph.get(j).get(2));
                    adj.get(i).add(node1);
                    adj.get(graph.get(j).get(1)).add(node2);
                }
            }
        }
        return adj;

    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int e = s.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i =0; i<e;i++){
            ArrayList<Integer> x = new ArrayList<>();
            x.add(s.nextInt());
            x.add(s.nextInt());
            x.add(s.nextInt());
            list.add(x);
        }

        ArrayList<ArrayList<NodeK>> adj = convertToAdj(list,n);
    }



}
