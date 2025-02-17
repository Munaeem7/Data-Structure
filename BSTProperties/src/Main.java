import com.sun.source.tree.Tree;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int nodes[] = {6,4,2,1,7,8,5,3};
        BST tree = new BST();
        for(int i = 0; i < nodes.length; i++){
            //tree.root = tree.insertRecursive(tree.root , nodes[i]);
            tree.insertIterative( nodes[i]);
        }

        tree.printRoute(tree.root , new ArrayList<TreeNode>());
//        tree.inOrder(tree.root);
//        System.out.println();
//        if(tree.search(tree.root , 3)){
//            System.out.println("found");
//        }else{
//            System.out.println("not found");
//        }

//        tree.delete(tree.root , 4);
//        tree.inOrder(tree.root);
//        System.out.println();
//
//        if(tree.search(tree.root , 8)){
//            System.out.println("found");
//        }else{
//            System.out.println("not found");
//        }
    }
}