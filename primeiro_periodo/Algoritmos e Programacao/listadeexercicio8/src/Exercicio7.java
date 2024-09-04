import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] vetor = new int[10];

        // Pede ao usuário para inserir os números
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            vetor[i] = sc.nextInt();
        }

        // Conta as ocorrências de cada número
        int[] contagem = new int[101]; // Índices de 1 a 100
        for (int i = 0; i < 10; i++) {
            contagem[vetor[i]]++;
        }

        // Imprime as ocorrências
        System.out.println("Ocorrências dos números:");
        for (int i = 1; i <= 100; i++) {
            if (contagem[i] > 0) {
                System.out.println(i + ": " + contagem[i] + " vezes");
            }
        }

        sc.close();
    }
}
