import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double A, B, C, delta, R1 = 0, R2 = 0;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        delta  = (Math.pow(B, 2) - 4 * A * C);

        if(delta < 0 || A == 0) {
            System.out.println("Impossível Calcular.");
        } else {
            R1 = (-B + Math.sqrt(delta)) / (2 * A);
            R2 = (-B - Math.sqrt(delta)) / (2 * A);
        }

        System.out.printf("R1 = %.5f", R1);
        System.out.printf("R2 = %.5f", R2);

        sc.close();
    }
}