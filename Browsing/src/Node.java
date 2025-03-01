public class Node {
    String url;
    Node next;
    Node prev;

    public Node(String url) {
        this.url = url;
        next = null;
        prev = null;
    }
}
