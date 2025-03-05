public class LinkedList {
    Node head = null;
    Node tail = null;

    public boolean isEmpty(){
        return head == null && tail == null;
    }
    // add a node at last
    public void addAtLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
    }

    // add a node at start
    public void addAtFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    //insert between list at specific index by using only location , data and head
    public void insertAt(int data, int idx){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
        }else{
            Node temp = head;
            for(int i = 1 ; i < idx ; i++){
                temp=temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
    }

    //insert between list at specific index by using only location , data current and previous
    public void insertbetween(int data , int loc){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
        } else if (loc == 1) {
            newnode.next = head;
            head = newnode;
        } else{
            Node curr = head;
            Node prev = null;
            int count = 1;
            while(curr != null){
                if(count == loc){
                    newnode.next = curr;
                    prev.next = newnode;
                    break;
                }
                count++;
                prev = curr;
                curr = curr.next;
            }
        }
    }

    //delete a node from start
    public void deleteFromStart(){
        if(head != null){
            head = head.next;
        }else{
            System.out.println("List is empty.");
        }
    }

    // delete a node from end
    public void deleteFromEnd(){
        Node curr = head;
        Node prev = null;
        while(curr.next!=null){
            prev = curr;
            curr=curr.next;
        }
        prev.next = null;
    }

    // to delete node from specific index
    public void deleteFrom(int loc){
        if(loc==1){
            Node temp = head;
            head = head.next;
        }
        Node curr = head;
        Node prev = null;
        int count = 1;
        while(curr.next!=null){
            if(count == loc){
                prev.next = curr.next;
            }

            count++;
            prev = curr;
            curr = curr.next;
        }
    }


    //display the List
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
