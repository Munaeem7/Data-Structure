public class Main {
    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue(4);
        p.Enqueue(10);
        p.Enqueue(20);
        p.Enqueue(30);
        p.Enqueue(40);

        System.out.println("All Elements of queue : ");
        p.display();

        System.out.println("removing highest priority element : "+p.dequeue());
        System.out.println("removing highest priority element : "+p.dequeue());
        System.out.println("Queue after removing elements : ");
        p.display();
    }
}