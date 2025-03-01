public class browsingHistory {
    Node head;
    Node last;
    Node currentlyVisiting;

    public browsingHistory() {
        head = null;
        last = null;
        currentlyVisiting = null;
    }

    public boolean isEmpty(){
        return head == null && last == null;
    }

    public void visit(String websiteUrl){
        Node newWebsite = new Node(websiteUrl);
        if(head == null){
            head = newWebsite;
            last = newWebsite;
        }else{
            last.next = newWebsite;
            newWebsite.prev = last;
            last = newWebsite;
        }
        if(currentlyVisiting != last){
            if (currentlyVisiting != null) {
                currentlyVisiting.next = newWebsite;
                newWebsite.prev = currentlyVisiting;
            }
        }
        currentlyVisiting = newWebsite;
        System.out.println("visited : "+newWebsite.url+" ");
    }

//    public void display(){
//        Node temp = head;
//        while(temp != null){
//            System.out.println("visited : "+temp.url+" ");
//            temp = temp.next;
//        }
//    }

    public void goBack(){
        if(isEmpty()){
            System.out.println("History is Empty..");
        }else{
            if(currentlyVisiting == head){
                System.out.println("No previous history..");
            }else{
                currentlyVisiting = currentlyVisiting.prev;
            }
        }
    }

    public void goForward(){
        if(isEmpty()){
            System.out.println("History is Empty..");
        }else{
            if(currentlyVisiting == last){
                System.out.println("No forward history..");
            }else{
                currentlyVisiting = currentlyVisiting.next;
            }
        }
    }


}
