import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        Graph  g = new Graph();
        g.createGraph(graph);

//        g.addEdge(graph , 0 , 1 ,10);
//        g.addEdge(graph , 0 , 2 ,15);
//        g.addEdge(graph , 0 , 3 ,30);
//        g.addEdge(graph , 1 , 3 ,40);
//        g.addEdge(graph , 2 , 3 ,50);

        g.addEdge(graph,0,1,28);
        g.addEdge(graph,0,5,10);
        g.addEdge(graph,1,6,14);
        g.addEdge(graph,1,2,16);
        g.addEdge(graph,2,3,12);
        g.addEdge(graph,3,6,18);
        g.addEdge(graph,3,4,22);
        g.addEdge(graph,4,6,29);
        g.addEdge(graph,4,5,25);



        g.prims(graph , 0 );

    }
}