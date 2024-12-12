package RefazendoListaExercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = sc.nextInt();
        }

        int somaPonderada = 0;
        int somaPesos = 0;

        for(int i = 0; i < vetor.length; i++){
            somaPonderada += vetor[i] * i;
            somaPesos += i;
        }

        double mediaPonderada = (somaPonderada == 0) ? 0 : (double) somaPonderada / somaPesos;

        System.out.printf("Resultado da Media Ponderada: %.2f", mediaPonderada);

        sc.close();
    }
}
