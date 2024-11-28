package ListaExercicio4;

public class BubbleSort {
    public static void sort(int[] arr) {

        /* 
         * O algoritmo BubbleSort compara elementos adjacentes no array e os troca se estiverem na ordem errada. 
         * Esse processo é repetido várias vezes até que o array esteja ordenado.
         */

        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Troca de elementos
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Se nenhum elemento foi trocado, o array já está ordenado
            if (!swapped) break;
        }
    }
}
