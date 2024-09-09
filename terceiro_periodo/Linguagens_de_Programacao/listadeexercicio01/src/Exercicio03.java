import java.util.Scanner;
import java.util.Locale;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int[] numeros = new int[10];

        numeros[0] = sc.nextInt();

        for(int i = 1; i < numeros.length; i++) {
            numeros[i] = numeros[i - 1] * 2;
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}