public class AVL {
    Server root = null;

    public Server insertServer(Server root , Server server){
        if(root == null){
            return server;
        }
        if(server.id > root.id){
            root.right = insertServer(root.right , server);
        } else if (server.id < root.id) {
            root.left = insertServer(root.left , server);
        }else{
            System.out.println("Server found..");
            return root;
        }

        root.height = Math.max(getHeight(root.left) , getHeight(root.right)) + 1;
        int balance = getBalance(root);

        // left left
        if(balance < -1 && server.id > root.right.id){
            return LeftRotate(root);
        }
        // right right
        if(balance > 1 && server.id < root.left.id){
            return rightRotate(root);
        }
        // left right
        if(balance > 1 && server.id > root.left.id){
            root.left = LeftRotate(root.left);
            return rightRotate(root);
        }
        // right left
        if(balance < -1 && server.id < root.right.id){
            root.right = rightRotate(root.right);
            return LeftRotate(root);
        }
        return root;
    }

    public int getHeight(Server root){
        if(root == null){
            return 0;
        }
        return root.height;
    }

    public int getBalance(Server node){
        if(node == null){
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }

    public Server LeftRotate(Server x){
        Server y = x.right;
        Server T2 = y.left;
         y.left = x;
         x.right = T2;

         x.height = Math.max(getHeight(x.left) , getHeight(x.right)) + 1;
         y.height = Math.max(getHeight(y.left) , getHeight(y.right)) + 1;
         return y;
    }

    public Server rightRotate(Server x){
        Server y = x.left;
        Server T2 = y.right;
        y.right = x;
        x.left = T2;

        x.height = Math.max(getHeight(x.left) , getHeight(x.right)) + 1;
        y.height = Math.max(getHeight(y.left) , getHeight(y.right)) + 1;
        return y;
    }

    public Server deleteServer(Server root , int id){
        if(root == null){
            System.out.println("tree is empty..");
            return null;
        }
        if(id > root.id){
            root.right = deleteServer(root.right , id);
        } else if (id < root.id) {
            root.left = deleteServer(root.left , id);
        }else{
            if(root.left == null && root.right == null){
                return null;
            }
            if(root.left == null){
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            Server IS = inOrderSuccessor(root);
            root.id = IS.id;
            root.capacity = IS.capacity;
            root.right = deleteServer(root.right , IS.id);
        }
        root.height = Math.max(getHeight(root.left) , getHeight(root.right)) + 1;
        int balance = getBalance(root);

        // left left case
        if(balance > 1 && getBalance(root.left) >= 0){
            return rightRotate(root);
        }
        // left right case
        if(balance > 1 && getBalance(root.left) < 0){
            root.left = LeftRotate(root.left);
            return rightRotate(root);
        }
        // right right case
        if(balance < -1 && getBalance(root.right) <= 0){
            return LeftRotate(root);
        }
        // right left case
        if(balance < -1 && getBalance(root.right) > 0){
            root.right = rightRotate(root.right);
            return LeftRotate(root);
        }
        return root;
    }

    public Server inOrderSuccessor(Server node){
        Server temp = node.right;
        while(temp.left != null){
            temp = temp.left;
        }
        return temp;
    }

    public void inOrderTraversal(Server root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.println("Server ID : "+root.id+", Server Capacity : "+root.capacity);
        inOrderTraversal(root.right);

    }

}
