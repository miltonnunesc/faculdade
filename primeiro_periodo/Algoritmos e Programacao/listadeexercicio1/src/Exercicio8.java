import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int X = sc.nextInt();

        int sum = 1;
        for (int i = 2; i < X; i++) {
            if (X % i == 0) {
                sum += i;
            }
        }

        if (sum == X) {
            System.out.println(X + " é um número perfeito.");
        } else {
            System.out.println(X + " não é um número perfeito.");
        }

        sc.close();
    }
}