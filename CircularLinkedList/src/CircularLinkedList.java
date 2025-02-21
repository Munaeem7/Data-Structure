public class CircularLinkedList {
    Node head = null;
    Node last = null;


    public void addAtStart(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            last = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        last.next = head;
    }

    public void addAtLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
        newNode.next = head;
    }

    public void addAtPosition(int data , int loc){
        Node newNode = new Node(data);
        if(head == null){
            if(loc != 1){
                System.out.println("Cannot insert at " + loc);
                return;
            }
            head = newNode;
            last = newNode;
            last.next = head;
            return;
        }
        if(loc == 1){
            addAtStart(data);
            return;
        }

        int nodeCount = 1;
        Node curr = head;
        do{
            if(nodeCount == loc-1){
                newNode.next = curr.next;
                curr.next = newNode;
                if(curr == last){
                    last = newNode;
                }
                return;
            }
            curr = curr.next;
            nodeCount++;
        }while(curr != head);
    }
    public void removeFromStart(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        last.next = head;

    }

    public void removeFromLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head == last){
            head = null;
            last = null;
            return;
        }
        Node curr = head;
        Node prev = null;
        while(curr.next != head){
            prev = curr;
            curr = curr.next;
        }
        curr.next = null;
        prev.next = head;
        curr = last;
        }

    public void removeFromPosition(int loc){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(loc == 1){
            removeFromStart();
        }
        int nodeCount = 1;
        Node curr = head;
        Node prev = null;
        while(curr.next != head){
            if(nodeCount == loc){
                prev.next = curr.next;
            }
            prev = curr;
            curr = curr.next;
            nodeCount++;
        }
    }

    public void display(){
        Node temp = head;
        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }while(temp != head);
        System.out.println();
    }
}
