package ListaExercicio5;

import java.util.Arrays;

public class Teste {
    public class SortingTest {
        public static void main(String[] args) {
            int[] array = {4, 10, 3, 5, 1};

            // Teste InsertionSort
            int[] insertionArray = array.clone();
            System.out.println("Original Array: " + Arrays.toString(insertionArray));
            InsertionSort.sort(insertionArray);
            System.out.println("InsertionSort Result: " + Arrays.toString(insertionArray));

            // Teste Build Max Heap
            int[] heapArray = array.clone();
            System.out.println("Original Array: " + Arrays.toString(heapArray));
            Heapify.buildMaxHeap(heapArray);
            System.out.println("Heapified Array (Max Heap): " + Arrays.toString(heapArray));
        }
    }
}