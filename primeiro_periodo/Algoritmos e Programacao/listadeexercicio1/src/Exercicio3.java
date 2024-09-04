import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo o valor monetário
        System.out.print("Digite o valor monetário (com duas casas decimais): ");
        double valorMonetario = scanner.nextDouble();

        // Convertendo o valor para centavos
        int centavos = (int) (valorMonetario * 100);

        // Definindo os valores das notas e moedas
        int[] notas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1.0, 0.5, 0.25, 0.1, 0.05, 0.01};

        // Calculando a quantidade de notas e moedas
        System.out.println("Notas:");
        for (int nota : notas) {
            int quantidade = centavos / (nota * 100);
            centavos %= (nota * 100);
            System.out.println(nota + " reais: " + quantidade);
        }

        System.out.println("Moedas:");
        for (double moeda : moedas) {
            int quantidade = centavos / (int) (moeda * 100);
            centavos %= (int) (moeda * 100);
            System.out.println(moeda + " reais: " + quantidade);
        }

        scanner.close();
    }
}
