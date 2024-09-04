import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[5];

        // Pede ao usuário para inserir os números
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            vetor[i] = sc.nextInt();
        }

        // Imprime os elementos do vetor em ordem inversa
        System.out.println("Elementos do vetor em ordem inversa:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

        sc.close();
    }
}