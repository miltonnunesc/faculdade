package ListaExercicio7;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int n = sc.nextInt();

        encontrarNumeroPerfeito(n);

        sc.close();
    }

    public static void encontrarNumeroPerfeito(int n){
        int count = 0;
        int num = 2;

        while (count < n) {
            if(perfeito(num)){
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    public static boolean perfeito(int num){
        int somaDivisores = 0;
        
        for(int i = 1; i <= num / 2; i++){
            if(num % i == 0){
                somaDivisores += i;
            }
        }

        return somaDivisores == num;
    }
}
