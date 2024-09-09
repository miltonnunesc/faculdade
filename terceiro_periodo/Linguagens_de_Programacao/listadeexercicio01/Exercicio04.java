import java.util.Scanner;
import java.util.Locale;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int x = sc.nextInt();
        int[] n = new int[100];

        n[0] = x;

        for(int i = 1; i < n.length; i++) {
            n[i] = n[i - 1] / 2;
            System.out.println(n[i]);
        }

        sc.close();
    }
}
