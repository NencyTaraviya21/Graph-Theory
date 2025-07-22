import java.util.Arrays;
import java.util.Comparator;

class Edge{
    int src, des, weight;
    Edge(int s, int d, int w){
        src=s;
        des=d;
        weight=w;
    }
}

class KrushKalAlgo{
    int [] parent;

    int find(int i){
        if(parent[i]==i)return i;
        return parent[i]=find(parent[i]);
    }

    void union(int v, int u){
      parent[find(u)] = find(v); 
    }

    void sortWeight(){
        int ver=6; //number of vertices (1-based, so need 6 for vertex 1 to 5)
        int edg=5;

        Edge[] edges = new Edge[edg];
        edges[0] = new Edge(1, 2, 1);
        edges[1] = new Edge(1, 3, 2);
        edges[2] = new Edge(2, 5, 4);
        edges[3] = new Edge(2, 3, 3);
        edges[4] = new Edge(1, 4, 5);

        Arrays.sort(edges, new Comparator<Edge>() {     //use to compare obj of two edges
             public int compare(Edge e1, Edge e2) {
                return e1.weight - e2.weight; //checks where e1>e2 or e1=e2 or e1<e2 from the value of e1 (-ve, +ve, 0)
            }
        });

        parent = new int[ver];
        for(int i=0; i<ver; i++)parent[i]=i; //will check every vertex and store in this array

        int weight = 0;

        for(Edge edge: edges){
            int uSet = find(edge.src); //gives src edge
            int vSet = find(edge.des); //gives des edge

              if (uSet != vSet) {
                System.out.println(edge.src + " - " + edge.des + " : " + edge.weight);
                weight += edge.weight; //to calculate wether getting minimum weight or not
                union(uSet, vSet);  //union of edges
            }
        }
        System.out.println("Total weight of MST: " + weight);
  

    }

    public static void main(String[] args) {
        KrushKalAlgo obj = new KrushKalAlgo();
        obj.sortWeight();
    }



}