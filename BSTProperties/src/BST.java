import java.util.ArrayList;

public class BST {
    TreeNode root;

    public BST() {
        this.root = null;
    }

    public void insertIterative(int data){
        TreeNode newNode = new TreeNode(data);
        if(root == null){
            root = newNode;
            return;
        }

        TreeNode curr = root;
        TreeNode parent = null;

        while(curr != null){
            if(data < curr.data){
                parent = curr;
                curr = curr.left;
            }else if(data > curr.data){
                parent = curr;
                curr = curr.right;
            }
        }

        if(data > parent.data){
            parent.right = newNode;
        }else{
            parent.left = newNode;
        }
    }

    public TreeNode insertRecursive(TreeNode root , int data){
        if(root == null){
            return new TreeNode(data);
        }

        if(data < root.data){
            root.left = insertRecursive(root.left , data);
        }else if(data > root.data){
            root.right = insertRecursive(root.right , data);
        }
        return root;
    }

    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public TreeNode delete(TreeNode root , int val){
        if(val > root.data){
            root.right = delete(root.right , val);
        }else if(val < root.data){
            root.left = delete(root.left , val);
        }else{  // val == root.data
            // case 1
            if(root.right == null && root.left == null){
                return null;
            }

            // case 2
            if(root.right == null){
                return root.left;
            }else if (root.left == null){
                return root.right;
            }

            // case 3
            TreeNode successor = findSuccessor(root);
            root.data = successor.data;
            root.right = delete(root.right , successor.data);
        }
        return root;
    }

    public TreeNode findSuccessor(TreeNode root){
        TreeNode curr = root.right;
        while(curr.left != null){
            curr = curr.left;
        }
        return curr;
    }

    public boolean search(TreeNode root , int key){
        if(root == null){
            return false;
        }else if(key > root.data){
            return search(root.right , key);
        }else if(key < root.data){
            return search(root.left , key);
        }else {
            return true;
        }
    }

    public void printRoute(TreeNode node , ArrayList<TreeNode> list){
        if(node == null){
            return;
        }
        list.add(node);
        if(node.left == null && node.right == null){
            print(list);
        }else {
            printRoute(node.left, list);
            printRoute(node.right, list);
        }
        list.remove(list.size() - 1);

    }
    public void print(ArrayList<TreeNode> list){
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i).data + "->");
        }
        System.out.println();
    }
}
