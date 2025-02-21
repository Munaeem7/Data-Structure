public class CircularDoubly {
    Node head = null;
    Node last = null;

    public void addAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            last = newNode;
            head.next = head;
            head.prev = head;
        } else {
            newNode.next = head;
            newNode.prev = last;
            head.prev = newNode;
            last.next = newNode;
            head = newNode;
        }
    }

    public void addAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            last = newNode;
            head.next = head;
            head.prev = head;
        } else {
            newNode.next = head;
            newNode.prev = last;
            last.next = newNode;
            head.prev = newNode;
            last = newNode;
        }
    }

    public void addAtPosition(int data, int loc) {
        Node newNode = new Node(data);
        if (loc < 1) {
            System.out.println("Position out of bound");
            return;
        }

        if (head == null) {
            if (loc == 1) {
                addAtStart(data);
            } else {
                System.out.println("Invalid location");
            }
            return;
        }

        if (loc == 1) {
            addAtStart(data);
            return;
        }

        Node curr = head;
        int nodeCount = 1;

        while (nodeCount < loc - 1 && curr.next != head) {
            curr = curr.next;
            nodeCount++;
        }

        if (nodeCount == loc - 1) {
            newNode.next = curr.next;
            newNode.prev = curr;
            curr.next.prev = newNode;
            curr.next = newNode;

            if (curr == last) {
                last = newNode;
            }
        } else {
            System.out.println("location out of bounds");
        }
    }

    public void removeFromStart() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == last) {
            head = null;
            last = null;
        } else {
            head = head.next;
            head.prev = last;
            last.next = head;
        }
    }

    public void removeFromLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == last) {
            head = null;
            last = null;
        } else {
            last = last.prev;
            last.next = head;
            head.prev = last;
        }
    }

    public void removeFromPosition(int loc) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (loc == 1) {
            removeFromStart();
            return;
        }

        Node curr = head;
        int nodeCount = 1;

        while (nodeCount < loc && curr.next != head) {
            curr = curr.next;
            nodeCount++;
        }

        if (nodeCount == loc) {
            curr.prev.next = curr.next;
            curr.next.prev = curr.prev;

            if (curr == last) {
                last = curr.prev;
            }
        } else {
            System.out.println("Position out of bounds");
        }
    }


    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}
