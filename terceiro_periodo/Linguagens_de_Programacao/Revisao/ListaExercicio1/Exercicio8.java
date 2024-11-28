package ListaExercicio1;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Random random = new Random();

        int n1, n2, n3, n4;
        System.out.println("Informe o número de linhas da primeira Matriz: ");
        n1 = sc.nextInt();

        System.out.println("Informe o número de colunas da primeira Matriz: ");
        n2 = sc.nextInt();

        System.out.println("Informe o número de linhas da segunda Matriz: ");
        n3 = sc.nextInt();

        System.out.println("Informe o número de colunas da segunda Matriz: ");
        n4 = sc.nextInt();

        if (n2 != n3) {
            System.out.println("Matriz com multiplicação inválida.");
            sc.close();
            return;
        }

        int[][] matriz = new int[n1][n2];
        int[][] matriz2 = new int[n3][n4];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = random.nextInt(99);
            }
        }

        for(int i = 0; i < matriz2.length; i++){
            for(int j = 0; j < matriz2[i].length; j++){
                matriz2[i][j] = random.nextInt(99);
            }
        }

        // Matriz1 Original
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("\n");

        // Matriz2 Original
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("\n");

        //Multiplicação da Matriz
        int[][] matriz3 = new int[n1][n4];

        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n4; j++){
                matriz3[i][j] = 0;
                for(int k = 0; k < n2; k++){
                    matriz3[i][j] += matriz[i][k] * matriz2[k][j];
                }
            }
        }

        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                System.out.print(matriz3[i][j] + "\t");
            }
            System.out.println("");
        }

        sc.close();
    }
}