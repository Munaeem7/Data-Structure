public class Main {
    public static void main(String[] args) {
        int capacity = 10;
        Server[] s = new Server[capacity];
        Server s1 = new Server(101,50);
        Server s2 = new Server(102,80);
        Server s3 = new Server(103,30);
        Server s4 = new Server(104,60);
        Server s5 = new Server(105,90);
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;
        s[3] = s4;
        s[4] = s5;
        Heap h = new Heap();
        int size = 0;
        size = h.insertHeap(s ,s[0].id, s[0].capacity , size);
        size = h.insertHeap(s ,s[1].id, s[1].capacity  , size);
        size = h.insertHeap(s ,s[2].id, s[2].capacity  , size);
        size = h.insertHeap(s ,s[3].id ,s[3].capacity  , size);
        size = h.insertHeap(s ,s[4].id, s[4].capacity  , size);
        // size = h.deleteHeap(s , size );
        System.out.println("Initial Max-Heap : ");
        h.printHeap(s , size);

        AVL tree = new AVL();
        System.out.println("Initial AVL Tree : ");
        tree.root = tree.insertServer(tree.root,s1);
        tree.root = tree.insertServer(tree.root,s2);
        tree.root = tree.insertServer(tree.root,s3);
        tree.root = tree.insertServer(tree.root,s4);
        tree.root = tree.insertServer(tree.root,s5);
        tree.inOrderTraversal(tree.root);
        System.out.println();

        // task assignment to Maximum capacity server
        Server MaxServer = h.findMaxHeap(s);
        MaxServer.capacity -=20;
        System.out.println("Assigning task requiring 20 CPU units :");
        System.out.println("Server Assigned : "+ MaxServer.id);
        size = h.deleteHeap(s,size);
        size = h.insertHeap(s , MaxServer.id , MaxServer.capacity , size);
        tree.root = tree.deleteServer(tree.root , MaxServer.id);
        tree.root = tree.insertServer(tree.root , new Server(MaxServer.id, MaxServer.capacity));

        // adding a new server
        size = h.insertHeap(s , 106 , 75 , size);
        tree.root = tree.insertServer(tree.root , new Server(106 , 75));
        System.out.println("Adding a new Server with ID 106 :");

        // delete a server
        size = h.deleteHeap(s, size);
        tree.root = tree.deleteServer(tree.root , 103);
        System.out.println("Removing a new Server with ID 103 :");


        System.out.println("Final Heap : ");
        h.printHeap(s , size);
        System.out.println("Final Avl Tree : ");
        tree.inOrderTraversal(tree.root);

    }
}
