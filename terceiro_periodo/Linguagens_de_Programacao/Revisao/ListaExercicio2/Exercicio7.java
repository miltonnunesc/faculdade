package ListaExercicio2;

public class Exercicio7 {
    public static int calcularMDC(int a, int b) {
        // Caso base: Se b for zero, o MDC é a
        if (b == 0) {
            return a;
        }

        // Recursivamente calcula o MDC
        return calcularMDC(b, a % b);
    }

    public static void main(String[] args) {
        int a = 56;
        int b = 98;
        System.out.println("MDC de " + a + " e " + b + " é: " + calcularMDC(a, b));
    }
}
