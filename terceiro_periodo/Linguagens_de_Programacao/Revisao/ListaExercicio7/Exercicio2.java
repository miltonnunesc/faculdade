package ListaExercicio7;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        int n = sc.nextInt();

        int[] vetor = new int[n];
        
        for(int i = 0; i < n; i++){
                vetor[i] = sc.nextInt();
        }

        Arrays.sort(vetor);

        int[] resultado = new int[vetor.length];
        int k = 0;

        resultado[k++] = vetor[0];

        for(int i = 1; i < n; i++){
                if(vetor[i] != vetor[i - 1]){
                    resultado[k++] = vetor[i];
            }
        }

        resultado = Arrays.copyOf(resultado, k);

        System.out.print("Resultado: ");
        for (int num : resultado) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
