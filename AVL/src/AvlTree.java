public class AvlTree {
    TreeNode root;

    public int getHeight(TreeNode node){
        if(node == null){
            return 0 ;
        }
        return node.height;
    }

    public int getBalance(TreeNode root){
        if(root == null){
            return 0;
        }
        return getHeight(root.left) - getHeight(root.right);
    }

    public TreeNode rightRotate(TreeNode root){
        TreeNode l = root.left;
        TreeNode lr = l.right;

        l.right = root;
        root.left = lr;

        // update heights
        root.height = Math.max(getHeight(root.left) , getHeight(root.right)) + 1;
        l.height = Math.max(getHeight(l.left) , getHeight(l.right)) + 1;

        return l;
    }

    public TreeNode leftRotate(TreeNode root){
        TreeNode r = root.right;
        TreeNode rl = r.left;

        r.left = root;
        root.right = rl;

        // update heights
        root.height = Math.max(getHeight(root.left) , getHeight(root.right)) + 1;
        r.height = Math.max(getHeight(r.left) , getHeight(r.right)) + 1;

        return r;
    }


    public TreeNode insert(TreeNode root , int data){
        TreeNode newNode = new TreeNode(data);

        if(root == null){
            return newNode;
        }

        if(data > root.data){
            root.right = insert(root.right , data);
        } else if (data < root.data) {
            root.left = insert(root.left , data);
        }else{
            System.out.println("Same node");
            return root;
        }

        root.height = Math.max(getHeight(root.left) , getHeight(root.right)) + 1;

        int balance = getBalance(root);

        // left left case
        if(balance > 1 && data < root.left.data){
            return rightRotate(root);
        }
        // right right case
        if(balance < -1 && data > root.right.data){
            return leftRotate(root);
        }

        // left right case
        if(balance > 1 && data > root.left.data){
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // right left case
        if(balance < -1 && data < root.right.data){
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    public void preOrder(TreeNode node){
        if(node  == null){
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
}
