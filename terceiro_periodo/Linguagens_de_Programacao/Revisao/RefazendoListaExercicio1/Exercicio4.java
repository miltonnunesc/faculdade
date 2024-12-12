package RefazendoListaExercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int[] vetor = new int[100];

        vetor[0] = sc.nextInt();

        for(int i = 1; i < vetor.length; i++){
            vetor[i] = vetor[i - 1] / 2;
        }

        for(int i = 0; i < vetor.length; i ++){
            System.out.print(vetor[i] + "\t");
        }

        sc.close();
    }
}
