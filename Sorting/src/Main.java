import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Sort S = new Sort();
        int length = 10000;
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10001);
        }

        // Bubble Sort
        int[] arrCopy = arr.clone();
        long startTime = System.nanoTime();
        int bubbleSteps = S.bubbleSort(arrCopy);
        long endTime = System.nanoTime();
        System.out.println("Bubble Sort Execution Time: " + (endTime - startTime) / 1_000_000.0 + " ms");
        System.out.println("Bubble Sort Steps: " + bubbleSteps);

        // Selection Sort
        arrCopy = arr.clone();
        startTime = System.nanoTime();
        int selectionSteps = S.selectionSort(arrCopy);
        endTime = System.nanoTime();
        System.out.println("Selection Sort Execution Time: " + (endTime - startTime) / 1_000_000.0 + " ms");
        System.out.println("Selection Sort Steps: " + selectionSteps);

        // Insertion Sort
        arrCopy = arr.clone();
        startTime = System.nanoTime();
        int insertionSteps = S.insertionSort(arrCopy);
        endTime = System.nanoTime();
        System.out.println("Insertion Sort Execution Time: " + (endTime - startTime) / 1_000_000.0 + " ms");
        System.out.println("Insertion Sort Steps: " + insertionSteps);

        // Merge Sort
        arrCopy = arr.clone();
        startTime = System.nanoTime();
        int mergeSteps = S.mergeSort(arrCopy, 0, arrCopy.length - 1);
        endTime = System.nanoTime();
        System.out.println("Merge Sort Execution Time: " + (endTime - startTime) / 1_000_000.0 + " ms");
        System.out.println("Merge Sort Steps: " + mergeSteps);

        // Quick Sort
        arrCopy = arr.clone();
        startTime = System.nanoTime();
        int quickSteps = S.quickSort(arrCopy, 0, arrCopy.length - 1);
        endTime = System.nanoTime();
        System.out.println("Quick Sort Execution Time: " + (endTime - startTime) / 1_000_000.0 + " ms");
        System.out.println("Quick Sort Steps: " + quickSteps);
    }
}
