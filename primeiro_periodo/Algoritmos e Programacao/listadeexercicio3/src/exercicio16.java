import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;

        x = sc.nextInt();
        y = sc.nextInt();

        if(x == 0 && y == 0) {
            System.out.println("O ponto está na origem.");
        } else if (x > 0) {
            if (y > 0) {
                System.out.println("O ponto está no 1º quadrante.");
            } else {
                System.out.println("O ponto está no 4º quadrante");
            }
        } else {
            if(y > 0) {
                System.out.println("O ponto está no 2º quadrante");
            } else {
                System.out.println("O ponto está no 3º quadrante.");
            }
        }

        sc.close();
    }
}
