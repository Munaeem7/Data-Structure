import com.sun.source.tree.Tree;

public class BST {
    TreeNode root;

    public BST() {
        root = null;
    }

    public void insert(int data){
        TreeNode newNode = new TreeNode(data);
        if(root == null){
            root = newNode;
            return;
        }

        TreeNode parent = null;
        TreeNode current = root;
        while(current != null){
            if(data > current.data){
                parent = current;
                current = current.right;
            }else if(data < current.data){
                parent = current;
                current = current.left;
            }else{
                System.out.println("data matched");
            }
        }

        if(data > parent.data){
            parent.right = newNode;
        }else{
            parent.left = newNode;
        }
    }

    public void inorderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    public boolean search(int data , TreeNode root){
        if(root == null){
            return false;
        } else if (data > root.data) {
            return search(data , root.right);
        }else if(data < root.data){
            return search( data , root.left);
        }else{
            return true;
        }
    }

    public TreeNode delete( TreeNode root  ,int data){
        if(root == null){
            return null;
        }

        if(data > root.data){
            root.right = delete(root.right , data);
        }else if(data < root.data){
            root.left = delete(root.left , data);
        }else{
            if(root.left == null && root.right ==null){
                return null;
            }

            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }

            TreeNode is = inOrderSuccessor(root);
            root.data = is.data;
            root.right = delete(root.right , is.data);
        }
        return root;
    }

    public TreeNode inOrderSuccessor(TreeNode root){
        TreeNode curr = root.left;
        while(curr.left != null){
            curr = curr.left;
        }
        return curr;
    }

    public int nodeCount(TreeNode root){
        if(root == null){
            return 0;
        }
        int lCount = nodeCount(root.left);
       int rCount = nodeCount(root.right);
       return lCount + rCount + 1;
    }

    public int sum(TreeNode root){
        if(root == null){
            return 0;
        }
        int lSum = nodeCount(root.left);
        int rSum = nodeCount(root.right);
        return lSum + rSum + root.data;
    }
}


