package Graphs;

public class Node {
   private int u;
   private int v;
   private int weight;
   Node(){};
   Node(int _u, int _v, int _w){u =_u; v = _v; weight= _w; }

   int getU(){return u; }
   int getV(){return v; }
   int getWeight(){return weight; }


}
