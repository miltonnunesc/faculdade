import java.util.Scanner;
import java.util.Locale;

public class exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double salario, valorVendas;

        salario = sc.nextDouble();

        valorVendas = sc.nextDouble();

        if(valorVendas <= 1500) {
            salario = (valorVendas * 0.03) + salario;
        } else {
            salario =  salario + (1500 * 0.03) + ((valorVendas - 1500) * 0.05);
        }

        System.out.printf("Salário final: R$%.2f", salario);

        sc.close();
    }
}