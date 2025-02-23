public class Main {
    public static void main(String[] args) {
        AVL tree = new AVL();
        tree.root = tree.insert(tree.root , 20);
        tree.root = tree.insert(tree.root , 10);
        tree.root = tree.insert(tree.root , 5);
        tree.root = tree.insert(tree.root , 3);
        tree.root = tree.insert(tree.root , 2);
        tree.root = tree.insert(tree.root , 30);
        tree.delete(tree.root , 20);
        tree.preOrder(tree.root);
    }
}