package RefazendoListaExercicio3.Exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        int[] numeros = {1, 2, 3, 4, 5};

        try {
            int x = sc.nextInt();
            System.out.printf("Acessando índice %d do array: \n", x);

            int valor = numeros[x];
            System.out.println("Valor: " + valor);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Tentativa de acessar um índice fora do limite do array.");
            System.out.println("Mensagem detalhada: " + e.getMessage());
        } finally {
            System.out.println("Programa finalizado.");
            sc.close();
        }
    }
}