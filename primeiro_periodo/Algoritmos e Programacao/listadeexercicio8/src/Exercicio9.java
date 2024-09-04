import java.util.Random;

public class Exercicio9 {
    public static void main(String[] args) {
        int n = 4; // Tamanho da matriz (4x4)

        // Criando as matrizes
        int[][] matriz1 = new int[n][n];
        int[][] matriz2 = new int[n][n];
        int[][] resultado = new int[n][n];

        // Preenchendo as matrizes com valores aleatórios
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz1[i][j] = random.nextInt(101); //
                matriz2[i][j] = random.nextInt(101);
            }
        }

        // Calculando o produto das matrizes
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        // Imprimindo a matriz resultante
        System.out.println("Matriz Resultante:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}