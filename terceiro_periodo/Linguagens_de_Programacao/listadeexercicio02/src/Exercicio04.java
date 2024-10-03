public class Exercicio04 {
    public static int maiorElemento(int[] array, int n) {
        if (n == 1) {
            return array[0];
        }
        return Math.max(array[n - 1], maiorElemento(array, n - 1));
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 3, 9, 2};
        System.out.println("Maior elemento: " + maiorElemento(array, array.length));
    }
}
