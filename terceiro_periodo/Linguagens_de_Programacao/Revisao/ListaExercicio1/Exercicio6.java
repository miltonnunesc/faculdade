package ListaExercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int[][] matriz = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        int a = matriz[0][0], b = matriz[0][1], c = matriz[0][2];
        int d = matriz[1][0], e = matriz[1][1], f = matriz[1][2];
        int g = matriz[2][0], h = matriz[2][1], i = matriz[2][2];

        int determinante = a * (e*i - f*h) - b * (d*i - f*g) + c * (d*h - e*g);

        System.out.println("Determinante da Matriz: " + determinante);

        sc.close();
    }
}
