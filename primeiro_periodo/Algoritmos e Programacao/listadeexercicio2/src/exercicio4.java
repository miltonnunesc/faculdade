import java.util.Scanner;
import java.util.Locale;

public class exercicio4 {
    public static void main(String [] args) {

        // Criação do Scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        // Criação das variáveis
        double salario, aumento;

        // Recebendo valores
        salario = sc.nextDouble();
        aumento = sc.nextDouble();

        // Aumento do salário
        salario = (salario * aumento) + salario;

        // Mostrando resultado na tela
        System.out.printf("%.2f", salario);

        sc.close();
    }
}
