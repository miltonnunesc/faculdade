import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro X: ");
        int X = sc.nextInt();

        boolean primo = true;

        if (X <= 1) {
            primo = false;
        } else {
            for (int i = 2; i * i <= X; i++) {
                if (X % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println(X + " é primo.");
        } else {
            System.out.println(X + " não é primo.");
        }

        sc.close();
    }
}