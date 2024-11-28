package ListaExercicio2;

public class Exercicio5 {
    public static int soma(int[] arr, int index) {
        // Caso base: Se for o último elemento
        if (index == arr.length) {
            return 0;
        }

        // Soma o elemento atual com a soma dos elementos seguintes
        return arr[index] + soma(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 8, 1};
        System.out.println("Soma dos elementos: " + soma(arr, 0));
    }
}
