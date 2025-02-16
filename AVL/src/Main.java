public class Main {
    public static void main(String[] args) {
        AvlTree tree = new AvlTree();
        tree.root = tree.insert(tree.root , 20);
        tree.root = tree.insert(tree.root , 10);
        tree.root = tree.insert(tree.root , 30);
        tree.root = tree.insert(tree.root , 0);
        tree.root = tree.insert(tree.root , 15);
        tree.root = tree.insert(tree.root , 13);
        tree.preOrder(tree.root);
    }
}