package RefazendoListaExercicio1;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Random r = new Random();

        int linha1, coluna1;
        int linha2, coluna2;

        do {
            System.out.println("Informe o número de linhas da Matriz 1: ");
            linha1 = sc.nextInt();

            System.out.println("Informe o número de colunas da Matriz 1: ");
            coluna1 = sc.nextInt();
            
            System.out.println("Informe o número de linhas da Matriz 2: ");
            linha2 = sc.nextInt();

            System.out.println("Informe o número de colunas da Matriz 2: ");
            coluna2 = sc.nextInt();

            if(coluna1 != linha2){
                System.out.println("\nMatriz impossível de calcular. Informe o número de colunas da Matriz 1 que seja equivalante ao número de linhas da Matriz 2.");
            }
        } while (coluna1 != linha2);

        int matriz1[][] = new int[linha1][coluna1];
        for(int i = 0; i < linha1; i++){
            for(int j = 0; j < coluna1; j++){
                matriz1[i][j] = r.nextInt(99);
            }
        }

        int matriz2[][] = new int[linha2][coluna2];
        for(int i = 0; i < linha2; i++){
            for(int j = 0; j < coluna2; j++){
                matriz2[i][j] = r.nextInt(99);
            }
        }

        int matriz3[][] = new int[linha1][coluna2];
        for(int i = 0; i < linha1; i++){
            for(int j = 0; j < coluna2; j++){
                matriz3[i][j] = 0;
                for(int k = 0; k < coluna1; k++){
                    matriz3[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        System.out.println("Matriz 1");
        for(int i = 0; i < linha1; i++){
            for(int j = 0; j < coluna1; j++){
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println("");
        }

        
        System.out.println("\nMatriz 2");
        for(int i = 0; i < linha2; i++){
            for(int j = 0; j < coluna2; j++){
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("\nResultado da Matriz");
        for(int i = 0; i < matriz3.length; i++){
            for(int j = 0; j < matriz3.length; j++){
                System.out.print(matriz3[i][j] + "\t");
            }
            System.out.println("");
        }

        sc.close();
    }
}
