import com.sun.source.tree.Tree;

public class AVL {
    TreeNode root;

    public AVL() {
        root = null;
    }

    public int getHeight(TreeNode r){
        if(r == null){
            return 0;
        }
        return r.height;
    }

    public int getBalance(TreeNode rt){
        if(rt == null){
            return 0;
        }
        return getHeight(rt.left) - getHeight(rt.right);
    }

    public TreeNode leftRotate(TreeNode x){
        TreeNode y = x.right;
        TreeNode yLeft = y.left;
        // perform rotation
        y.left = x;
        x.right = yLeft;
        // update heights
        x.height = Math.max(getHeight(x.left) , getHeight(x.right)) + 1;
        y.height = Math.max(getHeight(y.left) , getHeight(y.right)) + 1;
        return y;
    }

    public TreeNode rightRotate(TreeNode x){
        TreeNode y = x.left;
        TreeNode yRight = y.right;
        // perform rotation
        y.right = x;
        x.left = yRight;
        x.height = Math.max(getHeight(x.left) , getHeight(x.right)) + 1;
        y.height = Math.max(getHeight(y.left) , getHeight(y.right)) + 1;
        return y;
    }


    public TreeNode insert(TreeNode node ,int data){
        TreeNode newNode = new TreeNode(data);
        if(node == null){
            return newNode;
        }

        if(data > node.data){
            node.right = insert(node.right , data);
        } else if (data < node.data) {
            node.left = insert(node.left , data);
        }else{
            System.out.println("data matched..");
            return node;
        }


        node.height = Math.max(getHeight(node.left) , getHeight(node.right)) + 1;
        int balance = getBalance(node);

        // left left case
        if(balance > 1 && data < node.left.data){
            return rightRotate(node);
        }
        // left right case
        if(balance > 1 && data > node.left.data){
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        // right right case
        if(balance < -1 && data > node.right.data){
            return leftRotate(node);
        }
        // right left case
        if(balance < -1 && data < node.right.data){
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public TreeNode inorderSuccesor(TreeNode el){
        TreeNode temp = el.right;
        while(temp.left != null){
            temp = temp.left;
        }
        return temp;
    }

    public TreeNode delete(TreeNode dNode , int data){
        if(dNode == null){
            System.out.println("not found..");
            return null;
        }
        if(data > dNode.data){
            dNode.right = delete(dNode.right , data);
        } else if (data < dNode.data) {
            dNode.left = delete(dNode.left , data);
        }else{
            if(dNode.right == null & dNode.left == null){
                return null;
            }
            if(dNode.right == null){
                return dNode.left;
            } else if (dNode.left == null) {
                return dNode.right;
            }

            TreeNode IS = inorderSuccesor(dNode);
            dNode.data = IS.data;
            dNode.right = delete(dNode.right , IS.data);
        }

        dNode.height = Math.max(getHeight(dNode.left) , getHeight(dNode.right)) + 1;
        int bal = getBalance(dNode);


        // left left case
        if(bal > 1 && data < dNode.left.data){
            return rightRotate(node);
        }
        // left right case
        if(balance > 1 && data > node.left.data){
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        // right right case
        if(balance < -1 && data > node.right.data){
            return leftRotate(node);
        }
        // right left case
        if(balance < -1 && data < node.right.data){
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }


            return dNode;
    }

    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
