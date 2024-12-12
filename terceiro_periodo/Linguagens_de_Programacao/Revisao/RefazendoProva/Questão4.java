package RefazendoProva;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Questão4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Random r = new Random();

        System.out.println("Informe o número de linhas da Matriz: ");
        int n = sc.nextInt();

        System.out.println("Informe o número de colunas da Matriz: ");
        int m = sc.nextInt();

        int[][] matriz = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matriz[i][j] = r.nextInt(99);
            }
        }

        System.out.println("Matriz Original");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matriz[i][j] + " \t");
            }
            System.out.println("");
        }
        
        int[][] matrizT = new int[m][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrizT[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz Tranposta");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrizT[i][j] + " \t");
            }
            System.out.println("");
        }

        sc.close();
    }
}