public class Exercicio01 {
    public static int somaDigitos(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + somaDigitos(n / 10);
    }

    public static void main(String[] args) {
        System.out.println("Soma dos dígitos: " + somaDigitos(1234));
    }
}
