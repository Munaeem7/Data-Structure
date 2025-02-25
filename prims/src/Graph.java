import java.util.ArrayList;
import java.util.PriorityQueue;

public class Graph {
    public void createGraph(ArrayList<Edge> graph[] ){
        for(int  i =0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
    }
    public void addEdge(ArrayList<Edge> graph[], int src , int dest , int weight){
        graph[src].add(new Edge(src , dest , weight));
        graph[dest].add(new Edge(dest , src , weight));
    }

    public void prims(ArrayList<Edge> graph[] , int start){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean[] vis = new boolean[graph.length];
        int mstCost = 0;

        pq.add( new Pair(0 , -1 , 0));
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.vertex]){
                vis[curr.vertex]= true;
                mstCost += curr.cost;
                if(curr.aVertex != -1){
                    System.out.println(curr.aVertex +" -> "+curr.vertex +" , Cost : "+curr.cost);
                }
                for(int i = 0; i < graph[curr.vertex].size(); i++){
                    Edge e = graph[curr.vertex].get(i);
                    if(!vis[e.dest]){
                        pq.add(new Pair(e.dest , curr.vertex, e.weight));
                    }
                }
            }
        }

        System.out.println("Mst Value : "+mstCost);

    }
}
