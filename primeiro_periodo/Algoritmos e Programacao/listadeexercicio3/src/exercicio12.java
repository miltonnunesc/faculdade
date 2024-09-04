import java.util.Scanner;
import java.util.Locale;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double custoFabrica, custoFinal;

        custoFabrica = sc.nextDouble();

        custoFinal = (custoFabrica * 0.28) + (custoFabrica * 0.45) + custoFabrica;

        System.out.println("Custo final ao Consumidor: " + custoFinal);

        sc.close();
    }
}