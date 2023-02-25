package Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class convertToAdjList {
    public static ArrayList<ArrayList<Integer>> convertToAdjList(
            ArrayList<ArrayList<Integer>>edges, int v)
    {
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        for ( int i =0; i<v; i++){
            ArrayList<Integer> element = new ArrayList<>();
            output.add(element);
        }

        for(ArrayList<Integer> i : edges){
            int x = i.get(0);
            int y = i.get(1);
            ArrayList<Integer> array =  output.get(x);
            array.add(y);
            output.set(x,array);
        }

        return output;
    }
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); /// No of vertices
        int e = s.nextInt(); /// No of edges
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < e; i++) {
            int v1 = s.nextInt();
            int v2 = s.nextInt();
            ArrayList<Integer> element = new ArrayList<>();
            element.add(v1);
            element.add(v2);
            edges.add(element);
        }
        System.out.println(convertToAdjList(edges,n));
    }

}
