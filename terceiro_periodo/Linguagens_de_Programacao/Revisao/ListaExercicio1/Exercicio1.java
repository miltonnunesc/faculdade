package ListaExercicio1;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe 10 valores:");
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = sc.nextInt();
        }

        System.out.println("Números pares: ");
        for(int numero : numeros){
            if(numero % 2 == 0){
                System.out.print(numero + " ");
            }
        }

        System.out.println("\nNúmeros impares:");
        for(int numero : numeros){
            if(numero % 2 != 0){
                System.out.print(numero + " ");
            }
        }

        sc.close();
    }
}