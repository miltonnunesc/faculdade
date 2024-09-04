import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double f, c;

        f = sc.nextDouble();

        c = (f - 32) * 5/9;

        System.out.printf("Temperatura em F° informada: %.1f°\n", f);
        System.out.printf("Temperatura em C°: %.1f°", c);

        sc.close();
    }
}
