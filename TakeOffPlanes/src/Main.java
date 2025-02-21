
public class Main {
    public static void main(String[] args) {
        RunwayManagement r = new RunwayManagement();

        Plane p1 = new Plane("001",2,3);
        Plane p2 = new Plane("002",2,4);
        Plane p3 = new Plane("003",2,5);
        Plane p4 = new Plane("004",2,6);

        Plane p5 = new Plane("005",5,2);
        Plane p6 = new Plane("006",1,2);
        Plane p7 = new Plane("007",4,3);
        Plane p8 = new Plane("008",2,3);

        r.addPlaneInLandingQueue(p5);
        r.addPlaneInLandingQueue(p6);
        r.addPlaneInLandingQueue(p7);
        r.addPlaneInLandingQueue(p8);
        r.displayLandingQueue();

        r.addPlaneInTakeoffQueue(p1);
        r.addPlaneInTakeoffQueue(p2);
        r.addPlaneInTakeoffQueue(p3);
        r.addPlaneInTakeoffQueue(p4);
        r.displayTakeoffQueue();

        System.out.println("Landing Planes (on fuel priority) : ");
        System.out.println(r.removeFromLandingQueueOnFuelPriority() + " has landed.");
        System.out.println(r.removeFromLandingQueueOnFuelPriority() + " has landed.");
        System.out.println(r.removeFromLandingQueueOnFuelPriority() + " has landed.");
        System.out.println(r.removeFromLandingQueueOnFuelPriority() + " has landed.");
        System.out.println();

        System.out.println("Takeoff planes (on arrival based): ");
        System.out.println(r.removePlaneFromTakeoffQueue() + " has taken off.");
        System.out.println(r.removePlaneFromTakeoffQueue() + " has taken off.");
        System.out.println(r.removePlaneFromTakeoffQueue() + " has taken off.");
        System.out.println(r.removePlaneFromTakeoffQueue() + " has taken off.");
        

    }
}