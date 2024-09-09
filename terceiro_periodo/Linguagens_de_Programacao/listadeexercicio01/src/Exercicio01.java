import java.util.Scanner;
import java.util.Locale;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int[] numeros = new int[10];

        System.out.println("Informe dez numeros: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println("Numeros pares: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0){
                System.out.println(numeros[i]);
            }
        }
        System.out.println("Numeros impares: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
            }
        }

        sc.close();
    }
}