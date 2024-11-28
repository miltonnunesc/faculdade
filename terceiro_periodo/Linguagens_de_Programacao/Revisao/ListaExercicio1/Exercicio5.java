package ListaExercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        long numero;
        numero = sc.nextLong();

        long a = 0;
        long b = 1;
        long fibo = 0;

        for(int i = 1; i < numero; i++){
            fibo = a + b;
            a = b;
            b = fibo;
        }

        System.out.println("Fibonacci da posição " + numero + ": " + fibo);

        sc.close();
    }
}
