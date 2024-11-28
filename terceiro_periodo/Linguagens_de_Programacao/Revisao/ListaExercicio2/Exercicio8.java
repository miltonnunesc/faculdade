package ListaExercicio2;

public class Exercicio8 {
    public static int contarPares(int[] arr, int index) {
        // Caso base: Se chegou no final do array
        if (index == arr.length) {
            return 0;
        }

        // Se o elemento é par, conta 1, senão, conta 0
        int contar = (arr[index] % 2 == 0) ? 1 : 0;

        // Recursivamente conta os pares dos elementos seguintes
        return contar + contarPares(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Número de elementos pares: " + contarPares(arr, 0));
    }
}
