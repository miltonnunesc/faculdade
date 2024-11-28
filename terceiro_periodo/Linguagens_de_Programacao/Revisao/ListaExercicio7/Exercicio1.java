package ListaExercicio7;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Random random = new Random();

        System.out.println("Defina o tamanho do vetor");
        int v = sc.nextInt();

        int[] vetor = new int[v];

        for(int i = 0; i < v; i++){
            vetor[i] = random.nextInt(99);
        }

        System.out.println("Defina o tamanho da matriz");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = random.nextInt(99);
            }
        }

        int[] vetorM = new int[v];

        for(int i = 0; i < v; i++){
            for(int j = 0; j < v; j++){
                vetorM[i] += vetor[j] * matriz[j][i];
            }
        }

        System.out.print("Resultado: ");
        for (int i : vetorM) {
            System.out.print(i + " ");
        }
        
        sc.close();
    }
}
