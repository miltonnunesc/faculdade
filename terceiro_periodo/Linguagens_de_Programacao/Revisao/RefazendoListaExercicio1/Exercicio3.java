package RefazendoListaExercicio1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        vetor[0] = sc.nextInt();

        for(int i = 1; i < vetor.length; i++){
            vetor[i] = vetor[i - 1] * 2;
        }

        for(int v : vetor){
            System.out.print(v + "\t");
        }

        sc.close();
    }
}
