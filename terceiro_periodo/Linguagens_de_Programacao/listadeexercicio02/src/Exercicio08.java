public class Exercicio08 {
    public static int contarPares(int[] array, int n) {
        if (n == 0) {
            return 0;
        }
        int count = (array[n - 1] % 2 == 0) ? 1 : 0;
        return count + contarPares(array, n - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6};
        System.out.println("Número de pares: " + contarPares(array, array.length));
    }
}
