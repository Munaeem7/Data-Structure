import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST {
    TreeNode root;

    public BST() {
        root = null;
    }


    public void insert(int value){
        TreeNode newNode = new TreeNode(value);
        // if root is null
        if(root == null){
            root = newNode;
            System.out.println("root inserted..");
            return;
        }
        TreeNode current = root;
        TreeNode parent = null;
        while(current != null){
            parent = current;
            if (value > current.data) {
                current = current.right;
            } else if (value < current.data) {
                current = current.left;
            } else {
                System.out.println("Value already exist..");
                return;
            }
        }
        if(value > parent.data){
            parent.right = newNode;
        }
        if(value < parent.data){
            parent.left = newNode;
        }
    }

    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public int findMin(){
        int min;
        if(root == null){
            System.out.println("Tree is null..");
            return -1;
        }

        TreeNode curr = root;
        TreeNode parent = null;
        while(curr != null){
            parent = curr;
            curr = curr.left;
        }
        return parent.data;
    }

    public int findMax(){
        int max;
        if(root == null){
            System.out.println("Tree is null..");
            return -1;
        }

        TreeNode curr = root;
        TreeNode parent = null;
        while(curr != null){
            parent = curr;
            curr = curr.right;
        }
        return parent.data;
    }

    // Breadth first search
    public void BFS(){
        if(root == null){
            return;
        }
        TreeNode curr = root;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(curr);
        while(!q.isEmpty()){
            TreeNode temp = q.remove();
            System.out.print(temp.data   + " ");
            if(temp.left != null){
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
    }

    // depth first search
    public void DFS(){
        if(root == null){
            return;
        }

        Stack<TreeNode> s1 = new Stack<>();
        s1.push(root);
        while(!s1.isEmpty()){
            TreeNode temp = s1.pop();
            System.out.println(temp.data);
            if(temp.right != null){
                s1.push(temp.right);
            }
            if(temp.left != null){
                s1.push(temp.left);
            }
        }
    }

    public void postOrderTraversal1() {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode lastVisited = null; // To track the last visited node
        TreeNode current = root;

        while (!stack.isEmpty() || current != null) {
            // Go as far left as possible
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode peekNode = stack.peek();
                if (peekNode.right != null && lastVisited != peekNode.right) {
                    current = peekNode.right;
                } else {
                    System.out.print(peekNode.data + " ");
                    lastVisited = stack.pop(); // Pop after visiting
                }
            }
        }
    }

    public void postOrderTraversal() {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        // Push root to the first stack
        stack1.push(root);

        // Process all nodes
        while (!stack1.isEmpty()) {
            TreeNode current = stack1.pop();
            // Push the node to the second stack
            stack2.push(current);

            // Push left and right children to the first stack
            if (current.left != null) {
                stack1.push(current.left);
            }
            if (current.right != null) {
                stack1.push(current.right);
            }
        }

        // Pop all nodes from the second stack and print
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().data + " ");
        }
    }
}
