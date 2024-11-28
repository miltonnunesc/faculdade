package ListaExercicio5;

public class InsertionSort {
    public static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elementos maiores que a chave para uma posição à frente
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insere a chave na posição correta
            arr[j + 1] = key;
        }
    }

}
