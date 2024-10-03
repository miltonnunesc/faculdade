public class Exercicio09 {
    public static int somaNaturais(int n) {
        if (n == 0) {
            return 0;
        }
        return n + somaNaturais(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Soma de 1 a n: " + somaNaturais(5));
    }
}
