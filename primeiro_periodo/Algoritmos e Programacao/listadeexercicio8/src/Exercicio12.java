import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando a matriz 5x5
        int[][] matriz = new int[5][5];

        // Preenchendo a matriz com valores definidos pelo usuário
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Calculando a soma dos elementos da diagonal principal
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < 5; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }

        // Calculando a soma dos elementos da diagonal secundária
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < 5; i++) {
            somaDiagonalSecundaria += matriz[i][4 - i];
        }

        // Imprimindo os resultados
        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);

        sc.close();
    }
}