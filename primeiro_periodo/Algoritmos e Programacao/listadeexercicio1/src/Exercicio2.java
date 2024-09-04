import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lendo as notas A e B
        System.out.print("Digite a nota A (com uma casa decimal): ");
        double notaA = sc.nextDouble();
        System.out.print("Digite a nota B (com uma casa decimal): ");
        double notaB = sc.nextDouble();

        // Calculando a média ponderada
        double pesoA = 3.5;
        double pesoB = 7.5;
        double media = (notaA * pesoA + notaB * pesoB) / (pesoA + pesoB);

        // Imprimindo o resultado com 5 dígitos após o ponto decimal
        System.out.printf("MEDIA = %.5f%n", media);

        sc.close();
    }
}