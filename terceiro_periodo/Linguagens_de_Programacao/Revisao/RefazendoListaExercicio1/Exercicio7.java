package RefazendoListaExercicio1;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Random r = new Random();

        int n = sc.nextInt();

        while (n <= 2 || n >= 5) {
            System.out.println("Valor inválido.");
            n = sc.nextInt();
        }

        int[][] matriz = new int[n][n];

        for(int i = 0; i < matriz.length; i ++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = r.nextInt(n * n);
            }
        }

        int[][] matrizQ = new int[n][n];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matrizQ[i][j] = 0;
                for(int k = 0; k < matriz.length; k++){
                    matrizQ[i][j] += matriz[i][k] * matriz[k][j];
                }
            }
        }

        System.out.println("Matriz Original: ");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.printf(matriz[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("\nResultado da Matriz Quadrada: ");
        for(int i = 0; i < matrizQ.length; i++){
            for(int j = 0; j < matrizQ.length; j++){
                System.out.printf(matrizQ[i][j] + "\t");
            }
            System.out.println("");
        }

        sc.close();
    }
}