import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanho = 10; // Tamanho do vetor
        int[] vetor = new int[tamanho];

        // Lendo os elementos do vetor
        System.out.println("Insira " + tamanho + " números inteiros:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        // Lendo o valor de deslocamento
        System.out.print("Insira o valor de deslocamento: ");
        int deslocamento = sc.nextInt();

        // Realizando a rotação
        deslocamento %= tamanho; // Garantindo que o deslocamento seja menor que o tamanho do vetor
        int[] resultado = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            int novaPosicao = (i + deslocamento) % tamanho;
            resultado[novaPosicao] = vetor[i];
        }

        // Imprimindo o vetor resultante
        System.out.println("Vetor resultante:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(resultado[i] + " ");
        }

        sc.close();
    }
}
