package ListaExercicio2;

public class Exercicio10 {
    public static String converterParaBinario(int n) {
        // Caso base: Se n for 0 ou 1, retorna o próprio número como string
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }

        // Chama recursivamente para converter o resto da divisão por 2
        return converterParaBinario(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        int numero = 10;
        System.out.println("Número " + numero + " em binário é: " + converterParaBinario(numero));
    }
}
