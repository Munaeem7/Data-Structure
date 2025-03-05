public class Main {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addAtLast(20);
        l1.addAtLast(21);
        l1.addAtLast(22);
        l1.addAtLast(23);
        l1.addAtLast(24);
        l1.addAtLast(25);
        l1.addAtLast(25);
        l1.addAtLast(25);
        l1.display();

        LinkedList l2 = new LinkedList();
        Node temp = l1.head;
        while(!l1.isEmpty()){
            Node curr = l1.deleteFromStart();
            if(l2.head == null || curr.data != l2.tail.data){
                l2.addAtLast(curr.data);
            }
        }
        System.out.println("Removed duplicates : ");
        l2.display();
    }
}