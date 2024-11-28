package ListaExercicio5;

public class Heapify {
    public static void buildMaxHeap(int[] arr) {
        int n = arr.length;

        // Inicia no último nó pai e ajusta para cada subárvore
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i; // Inicializa o maior como raiz
        int left = 2 * i + 1; // Filho esquerdo
        int right = 2 * i + 2; // Filho direito

        // Se o filho esquerdo for maior que a raiz
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Se o filho direito for maior que o maior atual
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // Se o maior não for a raiz, troca
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursivamente ajusta o subárvore afetado
            heapify(arr, n, largest);
        }
    }

}
