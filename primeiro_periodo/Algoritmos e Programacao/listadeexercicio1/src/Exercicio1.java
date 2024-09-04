import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lendo os coeficientes da equação
        System.out.print("Digite o coeficiente A: ");
        double A = sc.nextDouble();
        System.out.print("Digite o coeficiente B: ");
        double B = sc.nextDouble();
        System.out.print("Digite o coeficiente C: ");
        double C = sc.nextDouble();

        // Calculando o discriminante
        double discriminante = B * B - 4 * A * C;

        if (discriminante < 0 || A == 0) {
            System.out.println("Impossivel calcular");
        } else {
            // Calculando as raízes
            double raiz1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            double raiz2 = (-B - Math.sqrt(discriminante)) / (2 * A);

            // Imprimindo as raízes com 5 casas decimais
            System.out.printf("R1 = %.5f%n", raiz1);
            System.out.printf("R2 = %.5f%n", raiz2);
        }

        sc.close();
    }
}