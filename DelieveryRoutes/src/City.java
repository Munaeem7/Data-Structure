public class City implements Comparable<City> {
    String name;
    int id;
    int distance;

    public City(String name, int id) {
        this.name = name;
        this.id = id;
        this.distance = Integer.MAX_VALUE;
    }


    @Override
    public int compareTo(City o) {
        return this.distance - o.distance;
    }
}
