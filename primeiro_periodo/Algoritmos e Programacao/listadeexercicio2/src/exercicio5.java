import java.util.Scanner;
import java.util.Locale;

public class exercicio5 {
    public static void main(String [] args) {

        // Criação do Scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        // Criação das variáveis
        double salario, gratificacao = 0.05, imposto = 0.07;

        // Recebendo valores
        salario = sc.nextDouble();

        // Calculando gratificação e imposto em relação a salario
        salario = ((salario * gratificacao) + salario);
        salario = (salario - (salario * imposto));

        // Mostrando valores na tela
        System.out.printf("%.2f", salario);

        sc.close();
    }
}