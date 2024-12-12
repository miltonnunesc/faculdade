package RefazendoListaExercicio3.Exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        try {
            double numero = sc.nextInt();

            double resultado = verificarRaiz(numero);

            System.out.println("Raiz do número informado: " + resultado);
            
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());

        } finally {
            System.out.println("Programa finalizado.");
            sc.close();
        }
    }

    public static double verificarRaiz(double x) throws IllegalArgumentException{
        if(x < 0) {
            throw new IllegalArgumentException("Não é possível calcular a raiz quadrada de um número negativo.");
        }

        return Math.sqrt(x);
    }
}