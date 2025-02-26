import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ShortestPath {

    public void createNetwork(ArrayList<Road> graph[] , int V ){
        for(int i = 0; i < V; i++){
            graph[i] = new ArrayList<Road>();
        }
    }

    public void addNewRoad(ArrayList<Road> graph[] ,int src , int dest , int weight){
        graph[src].add(new Road(src , dest , weight));
        graph[dest].add(new Road(dest , src , weight));
    }

    public void dijkstra(ArrayList<Road> graph[] , int src , City cities[]){
        PriorityQueue<City> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[cities.length];

        for(int i = 0; i < cities.length; i++){
            if(i != 0){
                cities[i].distance = Integer.MAX_VALUE;
            }
        }
        cities[0].distance = 0;

        pq.add(cities[0]);
        while(!pq.isEmpty()){
            City curr = pq.remove();
            if(!vis[curr.id]) {
                vis[curr.id] = true;
                for (int i = 0; i < graph[curr.id].size(); i++) {
                    Road r = graph[curr.id].get(i);
                    int u = r.src;
                    int v = r.dest;
                    if (cities[u].distance + r.weight < cities[v].distance) {
                        cities[v].distance = cities[u].distance + r.weight;
                        pq.add(cities[v]);
                    }
                }
            }
        }

        for(int i = 0; i < cities.length; i++){
            System.out.println(cities[src].name +" -> "+cities[i].name +" : "+cities[i].distance);
        }
    }
}
