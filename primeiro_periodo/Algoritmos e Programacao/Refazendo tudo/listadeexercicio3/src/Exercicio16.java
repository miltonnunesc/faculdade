import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Ponto no 1º quadrante.");
        } else if (x < 0 && y > 0) {
            System.out.println("Ponto no 2º quadrante.");
        } else if (x < 0 && y < 0) {
            System.out.println("Ponto no 3º quadrante.");
        } else {
            System.out.println("Ponto no 4º quadrante.");
        }

        sc.close();
    }
}
