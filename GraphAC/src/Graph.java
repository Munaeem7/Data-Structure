import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Graph {

    public void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1 , 2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
    }


    public void dijkstra(ArrayList<Edge> graph[] ,int src , int V){
        PriorityQueue<Pair> q = new PriorityQueue<>();
        boolean vis[] = new boolean[V];
        int[] dist = new int[V];
        for(int i = 0; i < V; i++){
            if(i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        q.add(new Pair(0,0));
        while(!q.isEmpty()){
            Pair curr = q.remove();
            if(!vis[curr.node]){
                vis[curr.node] = true;

                for(int i = 0; i < graph[curr.node].size(); i++){
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dist;
                    if(dist[u] + e.weight < dist[v]){
                        dist[v] = dist[u] + e.weight;
                        q.add(new Pair(v , dist[v]));
                    }
                }
            }
        }

        for(int i = 0; i < V; i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }





    public void bfs(int start , ArrayList<Edge> graph[]){
        Queue<Integer> q = new LinkedList<>();
        Boolean[] visited = new Boolean[graph.length];
        for(int i = 0; i < graph.length; i++){
            visited[i] = false;
        }
        q.add(start);
        visited[start] = true;
        System.out.println("Breadth first Traversal : ");
        while(!q.isEmpty()){
            int current = q.remove();
            System.out.print(current+" ");
            for(int i = 0; i < graph[current].size(); i++){
                Edge e = graph[current].get(i);
                if(!visited[e.dist]){
                    q.add(e.dist);
                    visited[e.dist] = true;
                }
            }
        }
    }

    public void BFSByTriColoring(int start , ArrayList<Edge> graph[]){
        Queue<Integer> q = new LinkedList<>();
        String[] color = new String[graph.length];
        for(int i = 0; i < graph.length; i++){
            color[i] = "white";
        }
        q.add(start);
        color[start] = "gray";
        System.out.println("BFS By Tri-Coloring : ");
        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr+ " ");
            for(int i = 0; i < graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                if(color[e.dist] == "white"){
                    q.add(e.dist);
                    color[e.dist] = "gray";
                }
            }
            color[curr] = "black";
        }
    }

    public void DFS(int curr , ArrayList<Edge> graph[]){
        boolean[] visited = new boolean[graph.length];
        dfs(curr , graph , visited);
    }

    private void dfs(int curr , ArrayList<Edge> graph[] , boolean[] visited){
        System.out.print(curr + " ");
        visited[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.dist]){
                dfs(e.dist , graph , visited);
            }
        }
    }

//    public void printAllPath(int curr , ArrayList<Edge> graph[] , boolean visited[] , int tar , String path){
//        if(curr == tar){
//            System.out.println(path);
//            return;
//        }
//
//        for(int i = 0; i < graph[curr].size(); i++){
//            Edge e = graph[curr].get(i);
//            if(!visited[e.dist]){
//                visited[e.dist] = true;
//                printAllPath(e.dist , graph , visited ,  tar , path);
//                visited[e.dist] = false;
//            }
//        }
//
//    }

    public boolean checkCycle(ArrayList<Edge> graph[], boolean vis[] , int curr, int par){
        vis[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dist] && e.dist != par){
                return true;
            }else if(!vis[e.dist]){
                if(checkCycle(graph, vis, e.dist, curr)){
                    return true;
                }
            }
        }
        return false;
    }

}
