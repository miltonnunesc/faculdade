import java.util.Scanner;
import java.util.Locale;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int[] numeros = new int[10];
        double media = 0;
        double peso = 0;

        System.out.println("Informe dez numeros: ");
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
             peso += i;
        }

        for(int i = 0; i < numeros.length; i++) {
            media = (numeros[i] * i) + media;
        }

        media = media / peso;

        System.out.printf("%.2f", media);
        
        sc.close();
    }
}
