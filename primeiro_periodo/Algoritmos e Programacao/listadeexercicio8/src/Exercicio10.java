import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanho = 5; // Tamanho dos vetores

        // Criando os vetores
        int[] vetor1 = new int[tamanho];
        int[] vetor2 = new int[tamanho];

        // Lendo os elementos do primeiro vetor

        System.out.println("Insira os elementos do primeiro vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = sc.nextInt();
        }

        // Lendo os elementos do segundo vetor
        System.out.println("Insira os elementos do segundo vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor2[i] = sc.nextInt();
        }

        // Encontrando os elementos comuns
        System.out.print("Elementos comuns: ");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (vetor1[i] == vetor2[j]) {
                    System.out.print(vetor1[i] + " ");
                    break;
                }
            }
        }

        sc.close();
    }
}