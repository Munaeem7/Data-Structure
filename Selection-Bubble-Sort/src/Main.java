public class Main {
    public static void main(String[] args) {
        Sorting s = new Sorting();
        int[] arr = {64,25,12,22,11};
        s.print(arr);
        s.bubbleSort(arr);
        System.out.println();
        s.print(arr);

    }
}