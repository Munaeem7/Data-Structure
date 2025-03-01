import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Prims p = new Prims();
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        p.create(graph);
        p.addVertex(graph , 0,1,10);
        p.addVertex(graph , 0,3,25);
        p.addVertex(graph , 1,2,10);
        p.addVertex(graph , 2,3,10);
        p.addVertex(graph , 3,4,2);
        p.addVertex(graph , 4,5,3);
        p.addVertex(graph , 5,6,3);
        p.addVertex(graph , 4,6,8);

        p.prims(graph , 0);
    }
}