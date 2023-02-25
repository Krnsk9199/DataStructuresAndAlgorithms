package Graphs;

import java.util.Comparator;


public  class SortComparator implements Comparator<Node> {

    @Override
    public int compare(Node node1, Node node2 ){
        if(node1.getWeight()< node2.getWeight()){
            return -1;
        }
        if(node1.getWeight() < node2.getWeight()){
            return 1;
        }
        return 0;
    }
}
