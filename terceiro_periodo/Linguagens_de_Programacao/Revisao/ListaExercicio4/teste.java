package ListaExercicio4;

import java.util.Random;

public class teste {
        public static void main(String[] args) {
        int size = 10000; // Tamanho do vetor
        int[] array = generateRandomArray(size);

        int[] bubbleArray = array.clone();
        int[] selectionArray = array.clone();

        // Teste BubbleSort
        long start = System.currentTimeMillis();
        BubbleSort.sort(bubbleArray);
        long end = System.currentTimeMillis();
        System.out.println("BubbleSort Execution Time: " + (end - start) + "ms");

        // Teste SelectionSort
        start = System.currentTimeMillis();
        SelectionSort.sort(selectionArray);
        end = System.currentTimeMillis();
        System.out.println("SelectionSort Execution Time: " + (end - start) + "ms");
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10000); // Números aleatórios de 0 a 9999
        }

        return array;
    }

}
