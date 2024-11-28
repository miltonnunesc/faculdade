package ListaExercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        double[] n = new double[100];
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        n[0] = sc.nextInt();

        for(int i = 1; i < n.length; i++){
            n[i] = n[i - 1] / 2;
        }

        for (int i = 0; i < n.length; i++) {
            System.out.printf("N[%d] = %.4f%n", i, n[i]);
        }

        sc.close();
    }
}