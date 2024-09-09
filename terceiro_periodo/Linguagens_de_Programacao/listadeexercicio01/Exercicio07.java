import java.util.Scanner;
import java.util.Locale;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int N = sc.nextInt();

        if (N < 2 || N > 5) {
            return;
        }

        int[][] matriz = new int[N][N];
        int valor = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = valor++;
            }
        }

        int[][] matrizQuadrada = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrizQuadrada[i][j] = 0;
                for (int k = 0; k < N; k++) {
                    matrizQuadrada[i][j] += matriz[i][k] * matriz[k][j];
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrizQuadrada[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
