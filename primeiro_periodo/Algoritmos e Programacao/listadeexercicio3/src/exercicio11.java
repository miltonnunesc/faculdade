import java.util.Scanner;
import java.util.Locale;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double salario, porc;

        salario = sc.nextDouble();
        porc = sc.nextDouble();

        porc = porc / 100;

        salario = (salario * porc) + salario;

        System.out.printf("R$%.2f", salario);

        sc.close();
    }
}
