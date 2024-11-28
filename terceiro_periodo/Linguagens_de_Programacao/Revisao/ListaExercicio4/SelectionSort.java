package ListaExercicio4;

public class SelectionSort {
    public static void sort(int[] arr) {

        /*
         * O algoritmo SelectionSort encontra o menor elemento no array e o coloca na primeira posição. 
         * Em seguida, repete o processo para o restante do array.
         */
        
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Encontra o menor elemento no subarray restante
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Troca o menor elemento com o primeiro elemento do subarray
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
