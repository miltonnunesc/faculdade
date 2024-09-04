import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int tamanhoVetor;

        System.out.println("Digite a quantidade de números a serem armazenados: ");
        tamanhoVetor = sc.nextInt();

        // Criar vetor
        double[] numeros = new double[tamanhoVetor];

        double media = 0;

        for(int i = 0; i < tamanhoVetor; i++){
            System.out.println("Digite o número " + (i + 1) + ": ");

            // Selecionar posição no vetor que irá guardar o número fornecido pelo usuario.
            numeros[i] = sc.nextDouble();

            // Soma do número na posição i
            media += numeros[i];
        }

        media = media / tamanhoVetor;

        System.out.println("A média dos números digitados é: " + media);

        sc.close();
    }
}