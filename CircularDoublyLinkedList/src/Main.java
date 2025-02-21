public class Main {
    public static void main(String[] args) {
        CircularDoubly c = new CircularDoubly();
        System.out.println("adding at start:");
        c.addAtStart(20);
        c.addAtStart(19);
        c.addAtStart(18);
        c.display();
        System.out.println("adding at last:");
        c.addAtLast(22);
        c.display();
        System.out.println("adding at loction 4:");
        c.addAtPosition(21,4);
        c.display();
        System.out.println("remove from last:");
        c.removeFromLast();
        c.display();
        System.out.println("remove from start:");
        c.removeFromStart();
        c.display();
        System.out.println("remove from location 2:");
        c.removeFromPosition(2);

        c.display();
    }
}