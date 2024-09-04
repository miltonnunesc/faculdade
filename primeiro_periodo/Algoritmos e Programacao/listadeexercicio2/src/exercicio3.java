import java.util.Scanner;
import java.util.Locale;

public class exercicio3 {
    public static void main(String [] args) {

        // Scanner Criado
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        // Variável criada
        double salario, aumento = 0.25;

        // Recebendo valores
        salario = sc.nextDouble();

        // Aumento do salario
        salario = (salario * aumento) + salario;

        // Mostrando resultado na tela
        System.out.printf("%.2f", salario);

        sc.close();
    }
}
