import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        BST t1 = new BST();

        t1.insert(8);
        t1.insert(7);
        t1.insert(6);
        t1.insert(9);
        t1.insert(4);
        t1.insert(5);
        t1.insert(2);
        t1.insert(10);
        t1.insert(12);
        System.out.println("In order : ");
        t1.inOrder(t1.root);
        System.out.println();
        System.out.println("pre order : ");
        t1.preOrder(t1.root);
        System.out.println();
        System.out.println("post order : ");
        t1.postOrder(t1.root);
        System.out.println();
        System.out.println("Min : "+t1.findMin());
        System.out.println("Max : "+t1.findMax());

        System.out.println("BFS: ");
        t1.BFS();
        System.out.println();
        System.out.println("DFS: ");
        t1.DFS();
        t1.postOrderTraversal1();

    }


}