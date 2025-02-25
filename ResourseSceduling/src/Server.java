public class Server {
     int id;
     int capacity;
     Server left , right;
     int height;

    public Server(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
        left = null;
        right = null;
        height = 0;
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }
}
