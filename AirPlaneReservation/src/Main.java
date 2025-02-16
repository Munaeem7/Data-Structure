public class Main {
    public static void main(String[] args) {
        Reservation r1 = new Reservation();
        r1.reserveSeat("munaeem");
        r1.display();
        r1.reserveSeat("hassan");
        System.out.println();
        r1.display();
        r1.reserveSeat("Nabeel");
        System.out.println();
        r1.display();
        System.out.println();
        r1.check("hassan");
        r1.removeSeat("Nabeel");
        System.out.println();
        r1.display();
    }
}