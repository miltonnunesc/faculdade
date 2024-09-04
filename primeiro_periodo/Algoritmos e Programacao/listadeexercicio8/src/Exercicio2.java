import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[15];

        // Preenche o vetor com os números digitados pelo usuário
        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Inicializa as variáveis para armazenar o maior e o menor número
        int maior = numeros[0];
        int menor = numeros[0];

        // Encontra o maior e o menor número no vetor
        int i = 1;
        while (i < 15) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            i++;
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        sc.close();
    }
}