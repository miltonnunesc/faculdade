package ListaExercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int n;
        n = sc.nextInt();

        // Definindo o  tamanho da Matriz
        if(n < 2 || n > 5 ){
            System.out.println("Número inválido.");
            sc.close();
            return;
        }

        int[][] matriz = new int[n][n];

        // Definindo os valores dentro da Matriz
        int valor = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = valor++;
            }
        }

        int [][] matriz2 = new int[n][n];

        // Multiplicando as Matrizes
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matriz2[i][j] = 0;
                for(int k = 0; k < n; k++){
                    matriz2[i][j] += matriz[i][k] * matriz[k][j];
                }
            }
        }

        // Matriz original
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("\n");

        // Resultado
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
