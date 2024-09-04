import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[20];

        // Preenche o vetor com os números digitados pelo usuário
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Números pares:");
        for (int i = 0; i < 20; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + "\t");
            }
        }

        System.out.println("\nNúmeros ímpares:");
        for (int i = 0; i < 20; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.print(numeros[i] + "\t");
            }
        }

        sc.close();
    }
}