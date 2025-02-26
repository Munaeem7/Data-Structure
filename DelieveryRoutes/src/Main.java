import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ShortestPath p = new ShortestPath();
        MergeSort sort = new MergeSort();
        int V = 5;
        ArrayList<Road> network[] = new ArrayList[V];
        p.createNetwork(network , V);

        p.addNewRoad(network , 0,1,4);
        p.addNewRoad(network , 0,2,2);
        p.addNewRoad(network , 1,2,1);
        p.addNewRoad(network , 1,3,5);
        p.addNewRoad(network , 2,4,10);
        p.addNewRoad(network , 3,4,2);

        City A = new City("A" , 0 );
        City B = new City("B" , 1 );
        City C = new City("C" , 2 );
        City D = new City("D" , 3 );
        City E = new City("E" , 4 );

        City[] cities = {A,B,C,D,E};


        System.out.println("Shortest distance from source : ");
        p.dijkstra(network , 0 , cities);

        System.out.println("-- Merge Sort : ---");

        int[] weights = {20, 5, 15, 10, 25, 30, 1};
        sort.divide(weights , 0 , weights.length - 1);
        for(int i = 0; i < weights.length; i++){
            System.out.print(weights[i]+" ");
        }

    }
}