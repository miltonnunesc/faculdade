package ListaExercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static int somaDigitios(int numero){
        if (numero < 10) {
            return numero;
        }

        return (numero % 10) + somaDigitios(numero / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int numero = sc.nextInt();

        int resultado = somaDigitios(numero);
        System.out.println("A soma dos dígitos de " + numero + " é: " + resultado);

        sc.close();
    }
}
