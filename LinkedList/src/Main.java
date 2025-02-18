import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL l = new LL();

        while(true){
            System.out.println("1 -> Add at last : ");
            System.out.println("2 -> Add at start : ");
            System.out.println("3 -> Add at specific index : ");
            System.out.println("4 -> remove from last : ");
            System.out.println("5 -> remove from start : ");
            System.out.println("6 -> remove from specific index : ");
            System.out.println("7 -> Display : ");
            System.out.println("8 -> Exit : ");

            System.out.println("enter choice : ");
            int choice = sc.nextInt();
            System.out.println();

            switch (choice){
                case 1:
                    System.out.println("Enter Integer to add at last : ");
                    int lastV = sc.nextInt();
                    l.addAtLast(lastV);
                    System.out.println("Value inserted at last successfully.");
                    break;
                case 2:
                    System.out.println("Enter Integer to add at start : ");
                    int startV = sc.nextInt();
                    l.addAtFirst(startV);
                    System.out.println("Value inserted at start successfully.");
                    break;
                case 3:
                    System.out.println("Enter Integer to add at specific location : ");
                    int specV = sc.nextInt();
                    System.out.println("Enter location to insert : ");
                    int loc = sc.nextInt();
                    l.insertbetween(specV,loc);
                    System.out.println("Value inserted successfully.");
                    break;
                case 4:
                    l.deleteFromEnd();
                    System.out.println("Value removed from Last successfully");
                    break;
                case 5:
                    l.deleteFromStart();
                    System.out.println("Value removed from Start successfully");
                    break;
                case 6:
                    System.out.println("Enter location to remove value : ");
                    int locR = sc.nextInt();
                    l.deleteFrom(locR);
                    System.out.println("Value removed from location "+locR+" successfully.");
                    break;
                case 7:
                    l.display();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input ...");

            }
        }
    }
}