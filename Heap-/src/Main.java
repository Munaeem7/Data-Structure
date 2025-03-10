public class Main {
    public static void main(String[] args) {
        Heap h = new Heap();
        int array[] = new int[10];
        array[0] = 20;
        array[1] = 25;
        array[2] = 30;
        array[3] = 35;
        array[4] = 40;

        int newSize = h.insert(array , 15 , 5);
        h.print(array , newSize);
    }
}