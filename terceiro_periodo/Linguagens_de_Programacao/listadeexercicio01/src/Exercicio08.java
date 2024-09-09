import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int linhas1 = sc.nextInt();
        int colunas1 = sc.nextInt();

        int linhas2 = sc.nextInt();
        int colunas2 = sc.nextInt();

        if (colunas1 != linhas2) {
            System.out.println("A multiplicação não é possível.");
            return;
        }

        int[][] matriz1 = new int[linhas1][colunas1];
        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas1; j++) {
                matriz1[i][j] = sc.nextInt();
            }
        }

        int[][] matriz2 = new int[linhas2][colunas2];
        for (int i = 0; i < linhas2; i++) {
            for (int j = 0; j < colunas2; j++) {
                matriz2[i][j] = sc.nextInt();
            }
        }

        int[][] resultado = new int[linhas1][colunas2];

        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas2; j++) {
                resultado[i][j] = 0;
                for (int k = 0; k < colunas1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas2; j++) {
                System.out.print(resultado[i][j] + "\t");
            }
        }
    }
}