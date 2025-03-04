public class Main {
    public static void main(String[] args) {
        BST t = new BST();
        t.insert(10);
        t.insert(12);
        t.insert(13);
        t.insert(14);
        t.insert(15);
        t.insert(17);
        t.inorderTraversal(t.root);
        System.out.println();
        t.delete(t.root , 15);
        t.inorderTraversal(t.root);
        System.out.println("Count : "+t.nodeCount(t.root));

        System.out.println();
        if(t.search(12,t.root)){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
        System.out.println();
        System.out.println(t.sum(t.root));
    }
}