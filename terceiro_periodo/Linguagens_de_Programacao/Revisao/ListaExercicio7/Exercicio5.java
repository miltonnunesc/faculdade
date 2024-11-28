package ListaExercicio7;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int n1 = scanner.nextInt();
        int[] vetor1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            vetor1[i] = scanner.nextInt();
        }

        int n2 = scanner.nextInt();
        int[] vetor2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            vetor2[i] = scanner.nextInt();
        }

        int[] intersecao = new int[Math.min(n1, n2)];
        int tamanho = 0;

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (vetor1[i] == vetor2[j] && !contido(intersecao, tamanho, vetor1[i])) {
                    intersecao[tamanho++] = vetor1[i];
                }
            }
        }

        for (int i = 0; i < tamanho; i++) {
            System.out.print(intersecao[i] + " ");
        }

        scanner.close();
    }

    public static boolean contido(int[] vetor, int tamanho, int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }
}
