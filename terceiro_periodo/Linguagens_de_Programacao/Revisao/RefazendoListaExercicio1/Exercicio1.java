package RefazendoListaExercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = sc.nextInt();
        }

        System.out.println("Números Pares:");
        for(int v : vetor){
            if(v % 2 == 0){
                System.out.print(v + "\t");
            }
        }

        System.out.println("\nNúmeros Ímpares:");
        for(int v : vetor){
            if(v % 2 != 0){
                System.out.print(v + "\t");
            }
        }

        sc.close();
    }
}