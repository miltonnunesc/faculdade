package ListaExercicio6;

import java.util.Random;

public class Teste {
        public static void main(String[] args) {
        int size = 10000; // Tamanho do vetor
        int[] originalArray = generateRandomArray(size);

        // Teste HeapSort
        int[] heapArray = originalArray.clone();
        long start = System.currentTimeMillis();
        HeapSort.sort(heapArray);
        long end = System.currentTimeMillis();
        System.out.println("HeapSort Execution Time: " + (end - start) + "ms");

        // Teste MergeSort
        int[] mergeArray = originalArray.clone();
        start = System.currentTimeMillis();
        MergeSort.sort(mergeArray);
        end = System.currentTimeMillis();
        System.out.println("MergeSort Execution Time: " + (end - start) + "ms");

        // Teste QuickSort
        int[] quickArray = originalArray.clone();
        start = System.currentTimeMillis();
        QuickSort.sort(quickArray);
        end = System.currentTimeMillis();
        System.out.println("QuickSort Execution Time: " + (end - start) + "ms");
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10000); // Gera números de 0 a 9999
        }

        return array;
    }

}
