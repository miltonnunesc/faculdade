import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos valores A, B e C
        System.out.print("Digite o valor de A: ");
        double A = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        double B = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        double C = sc.nextDouble();

        // Ordenação dos valores em ordem decrescente
        if (A < B) {
            double temp = A;
            A = B;
            B = temp;
        }
        if (A < C) {
            double temp = A;
            A = C;
            C = temp;
        }
        if (B < C) {
            double temp = B;
            B = C;
            C = temp;
        }

        // Verificação do tipo de triângulo
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (A * A == B * B + C * C) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (A * A > B * B + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (A * A < B * B + C * C) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || B == C || A == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        
        sc.close();
    }
}