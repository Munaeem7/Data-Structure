public class Pair implements Comparable<Pair>{
    int vertex;
    int aVertex;
    int cost;

    public Pair(int vertex, int aVertex, int cost) {
        this.vertex = vertex;
        this.aVertex = aVertex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Pair o) {
        return this.cost-o.cost;
    }
}
