import jdk.jshell.spi.SPIResolutionException;

public class tree {

    int index = -1;
    public Node buildTree(int nodes[]){
        index++;
        if(nodes[index] == -1){
            return null;
        }

        Node newNode = new Node(nodes[index]);
        newNode.left= buildTree(nodes);
        newNode.right= buildTree(nodes);

        return newNode;
    }

    public void PreOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    public void postOrder(Node root){
        if(root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public void inOrder(Node root){
        if (root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }


}
