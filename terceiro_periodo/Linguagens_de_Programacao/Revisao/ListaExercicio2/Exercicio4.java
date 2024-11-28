package ListaExercicio2;

public class Exercicio4 {
    public static int encontrarMaior(int[] arr, int index) {
        // Caso base: Se estiver no último elemento
        if (index == arr.length - 1) {
            return arr[index];
        }

        // Recursivamente encontra o maior entre os elementos restantes
        int maiorRestante = encontrarMaior(arr, index + 1);

        // Retorna o maior entre o elemento atual e o maior restante
        return Math.max(arr[index], maiorRestante);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 8, 1, 9};
        System.out.println("Maior elemento: " + encontrarMaior(arr, 0));
    }
}
