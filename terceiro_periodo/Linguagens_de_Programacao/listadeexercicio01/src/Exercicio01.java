import java.util.Scanner;
import java.util.Locale;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int[] numeros = new int[10];

        for(int i = 0; i < numeros.length; i++) {
            System.out.printf("Informe o %dº numero: ", i + 1);
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nNumeros pares:");
        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }

        System.out.println("\nNumeros impares:");
        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
            }
        }
        
        sc.close();
    }
}