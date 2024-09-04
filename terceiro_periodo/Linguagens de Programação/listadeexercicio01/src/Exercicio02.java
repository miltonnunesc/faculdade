import java.util.Scanner;
import java.util.Locale;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int[] numeros = new int[10];

        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        for(int numero : numeros) {
            for(int i = 0; i < numeros.length; i++) {
                
            }
        }
    }
}
