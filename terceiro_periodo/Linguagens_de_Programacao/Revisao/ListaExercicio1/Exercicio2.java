package ListaExercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe dez números: ");
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = sc.nextInt();
        }

        int somaPonderada = 0;
        int somaPesos = 0;

        for(int i = 0; i < numeros.length; i++){
            somaPonderada += numeros[i] * i;
            somaPesos += i;
        }

        double mediaPonderada = (somaPonderada == 0) ? 0 : (double) somaPonderada / somaPesos;

        System.out.printf("A média ponderada dos valores é: %.2f", mediaPonderada);

        sc.close();
    }
}
