public class RunwayManagement {
    Node lhead = null;
    Node llast = null;
    Node thead = null;
    Node tlast = null;

    // to check if takeOff queue is empty
    public boolean isEmptyTakeoffQueue(){
        return thead == null && tlast == null;
    }
    // to check if Landing queue is empty
    public boolean isEmptyLandingQueue(){
        return lhead == null ;
    }
    // to add plane in Landing Queue
    public void addPlaneInLandingQueue(Plane p){
        Node newNode = new Node(p);
        if(isEmptyLandingQueue()){
            lhead = newNode;
            llast = newNode;
        }else{
            llast.next = newNode;
            llast = newNode;
        }
    }

    // to remove plane from Landing Queue on fuel priority
    public Plane removeFromLandingQueueOnFuelPriority(){
        if(isEmptyLandingQueue()){
            System.out.println("No plane in landing queue");
            return null;
        }
        Plane removedPlane = lhead.plane;

        if(lhead.plane.getFuelLevel() < getMinFuelLevel(lhead.next)){
            lhead = lhead.next;
            return removedPlane;
        }


        Plane minFuelPlane = lhead.plane;
        Node temp = lhead;
        while(temp != null){
            if(temp.plane.getFuelLevel() < minFuelPlane.getFuelLevel()){
                minFuelPlane = temp.plane;
            }
            temp = temp.next;
        }
        removedPlane = minFuelPlane;

        if(removedPlane != lhead.plane){

            Node prev = null;
            Node curr = lhead;
            while(curr != null) {
                if (curr.plane == removedPlane) {
                    prev.next = curr.next;
                }
                prev = curr;
                curr = curr.next;
            }
        }

        return removedPlane;
    }

    // to get minimum fuel level
    private int getMinFuelLevel(Node head){
        int minFuelLevel = Integer.MAX_VALUE;
        Node temp = head;
        while(temp != null){
            if(temp.plane.getFuelLevel() < minFuelLevel){
                minFuelLevel = temp.plane.getFuelLevel();
            }
            temp = temp.next;
        }
        return minFuelLevel;
    }

    // to display Landing queue
    public void displayLandingQueue(){

        if(isEmptyLandingQueue()){
            System.out.println("Landing queue is empty..");

        }else {
            Node temp = lhead;
            System.out.println("Planes in Landing queue : ");
            while (temp != null) {
                System.out.println(temp.plane.toString());
                temp = temp.next;
            }
        }
        System.out.println();
    }

    // to add plane in takeOff Queue
    public void addPlaneInTakeoffQueue(Plane p){
        Node newNode = new Node(p);
        if(isEmptyTakeoffQueue()){
            thead = newNode;
            tlast = newNode;
        }else{
            tlast.next = newNode;
            tlast = newNode;
        }
        newNode.next = thead;
    }

    // to remove plane from takeOff Queue in FIFO order
    public Plane removePlaneFromTakeoffQueue(){
        if(isEmptyTakeoffQueue()){
            System.out.println("Queue is empty..");
            return null;
        }
        Node result = thead;
        if(thead == tlast){
            thead = null;
            tlast = null;
        }else {

            thead = thead.next;
            tlast.next = thead;
        }
        return result.plane;
    }

    // to display takeoff queue
    public void displayTakeoffQueue(){

        if(isEmptyTakeoffQueue()){
            System.out.println("Takeoff Queue is empty..");
            return;
        }
        Node temp = thead;
        System.out.println("Planes waiting for takeoff : ");
        do{
            System.out.println(temp.plane.toString());
            temp = temp.next;
        }while(temp != thead);
        System.out.println();
    }
}
