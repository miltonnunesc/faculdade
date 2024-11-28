package ListaExercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o primeiro valor: ");
        numeros[0] = sc.nextInt();

        for(int i = 1; i < numeros.length; i++){
            numeros[i] = numeros[i - 1] * 2;
        }

        for(int numero : numeros){
            System.out.println(numero + " ");
        }

        sc.close();
    }
}