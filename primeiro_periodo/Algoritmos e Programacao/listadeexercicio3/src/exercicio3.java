import java.util.Scanner;

public class exercicio3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        double f, c;

        f = sc.nextDouble();

        c = (f - 32) * 5 / 9;

        System.out.printf("Celsius: %.2f°", c);

        sc.close();
    }
}
