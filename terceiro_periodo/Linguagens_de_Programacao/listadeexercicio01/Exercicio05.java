import java.util.Scanner;
import java.util.Locale;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(0);

        } else if (n == 1) {
            System.out.println(1);

        } else {
            long anterior = 0, atual = 1;

            for (int i = 2; i <= n; i++) {
                long proximo = anterior + atual;
                anterior = atual;
                atual = proximo;
            }
            
            System.out.println(atual);
        }

        sc.close();
    }
}