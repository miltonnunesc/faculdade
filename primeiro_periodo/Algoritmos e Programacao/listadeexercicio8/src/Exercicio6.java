import java.util.Random;

public class Exercicio6 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Random random = new Random();

        // Preenche o vetor com números aleatórios entre 1 e 100
        for (int i = 0; i < 10; i++) {
            vetor[i] = random.nextInt(100) + 1; // O "+1" garante que os números gerados vão de 1 a 100, pois normalmente vão de 0 a 99.
        }

        // Imprime os elementos do vetor
        System.out.println("Elementos do vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

        // Calcula e imprime a soma dos elementos
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += vetor[i];
        }
        System.out.println("\nSoma dos elementos: " + soma);
    }
}