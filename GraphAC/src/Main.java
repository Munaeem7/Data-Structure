import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        Graph g = new Graph();
        g.createGraph(graph);

//        for(int i = 0; i < graph[3].size(); i++){
//            Edge n = graph[3].get(i);
//            System.out.println(n.src +" -> "+n.dist);
//        }

        g.bfs(0, graph);
//        System.out.println();
//        g.BFSByTriColoring(0 , graph);
//        System.out.println();
        System.out.println(     );
        g.DFS(0 , graph);

        //System.out.println(g.checkCycle(graph , new boolean[V] , 0 , -1));
        //g.dijkstra(graph , 0 , V );


    }
}