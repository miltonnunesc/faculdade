import java.util.Scanner;
import java.util.Locale;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double x, a, b, c, d, e;

        x = sc.nextDouble();

        a = Math.pow(x,3) + (5 * Math.pow(x,7)) + (2 * Math.pow(x, 9));

        //

        b = Math.sin(x) / x;

        //

        c = Math.pow((1 + 1/x),x);

        //

        d = Math.sqrt(Math.log(Math.abs(x) + 1) + Math.log((Math.abs(x) + 1)) / Math.log(2));

        //

        e = Math.asin(x) + Math.acos(x);

        System.out.println("Resultado da letra A: " + a);
        System.out.println("Resultado da Letra B: " + b);
        System.out.println("Resultado da Letra C: " + c);
        System.out.println("Resultado da Letra D: " + d);
        System.out.println("Resultado da Letra E: " + e);

        sc.close();
    }
}