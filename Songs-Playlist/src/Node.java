public class Node {
    String songTitle;
    String songArtist;
    Node prev;
    Node next;

    public Node(String songTitle, String songArtist) {
        this.songTitle = songTitle;
        this.songArtist = songArtist;
        prev = null;
        next = null;
    }
}
