import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of queue:");
        int size = sc.nextInt();
        CircularQueue m  =new CircularQueue(size);
        while(true){
            System.out.println(" >> Press 1 for Enqueue : ");
            System.out.println(" >> Press 2 for dequeue : ");
            System.out.println(" >> Press 3 for peek : ");
            System.out.println(" >> Press 4 for size : ");
            System.out.println(" >> Press 5 for exit : ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter integer to enqueue: ");
                    while(true) {
                        try {
                            int num = sc.nextInt();
                            m.enQueue(num);
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Exception >> "+e);
                            sc.nextLine();
                            System.out.println("enter valid value : ");
                        }
                    }
                    break;
                case 2:
                    int removed = m.deQueue();
                    System.out.println(removed + " >> First element removed successfully..");
                    break;
                case 3:
                    int peek = m.peek();
                    System.out.println("peek = "+peek);
                    break;
                case 4:
                    System.out.println("Size is "+m.size());
                    break;
                case 5:
                    System.out.println("Exiting");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice..");
            }

        }

    }
}