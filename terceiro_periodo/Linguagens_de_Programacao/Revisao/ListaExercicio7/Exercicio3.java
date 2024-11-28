package ListaExercicio7;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int n;

        n = sc.nextInt();

        int passos = 0;

        while(n != 1){
            if(n % 2 == 0){
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }

            passos++;
        }

        System.out.println("Resultado: " + n);
        System.out.println("Número de passo: " + passos);

        sc.close();
    }
}