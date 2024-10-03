public class Exercicio05 {
    public static int somaArray(int[] array, int n) {
        if (n == 0) {
            return 0;
        }
        return array[n - 1] + somaArray(array, n - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println("Soma dos elementos: " + somaArray(array, array.length));
    }
}
