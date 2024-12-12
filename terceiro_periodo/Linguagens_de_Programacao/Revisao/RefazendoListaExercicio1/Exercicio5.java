package RefazendoListaExercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int valor = sc.nextInt();

        long fibo = 0;
        long a = 0;
        long b = 1;

        for(int i = 2; i <= valor; i++){
            fibo = a + b;
            a = b;
            b = fibo;
        }

        System.out.println("Valor da posição informada: " + fibo);

        sc.close();
    }
}