public class Exercicio02 {
    public static int potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        return base * potencia(base, expoente - 1);
    }

    public static void main(String[] args) {
        System.out.println("Potencia: " + potencia(2, 3)); // 8
    }

}
