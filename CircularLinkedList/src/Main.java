public class Main {
    public static void main(String[] args) {

        CircularLinkedList c = new CircularLinkedList();
        c.addAtStart(22);
        c.addAtStart(21);
        c.addAtStart(20);
        c.addAtLast(24);
        c.addAtPosition(23,4);
        c.display();
        c.removeFromStart();
        c.removeFromLast();
        c.display();
        c.removeFromPosition(2);
        c.display();


    }
}