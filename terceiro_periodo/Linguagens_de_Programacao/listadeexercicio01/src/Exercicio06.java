import java.util.Scanner;
import java.util.Locale;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int[][] matriz = new int[3][3];

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int a = matriz[0][0];
        int b = matriz[0][1];
        int c = matriz[0][2];
        int d = matriz[1][0];
        int e = matriz[1][1];
        int f = matriz[1][2];
        int g = matriz[2][0];
        int h = matriz[2][1];
        int i = matriz[2][2];

        int determinante = a * (e * i - f * h)
                           - b * (d * i - f * g)
                           + c * (d * h - e * g);

        System.out.println("Valor da determinante da Matriz: " + determinante);

        sc.close();
    }
}
