import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] vetor = new int[10];
        int positivos = 0;
        int negativos = 0;

        // Pede ao usuário para inserir os números
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            vetor[i] = sc.nextInt();

            if (vetor[i] > 0) {
                positivos++;
            } else if (vetor[i] < 0) {
                negativos++;
            }
        }

        // Imprime a contagem de positivos e negativos
        System.out.println("Quantidade de números positivos: " + positivos);
        System.out.println("Quantidade de números negativos: " + negativos);

        sc.close();
    }
}
