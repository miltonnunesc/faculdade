import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario, aumento;

        salario = sc.nextDouble();
        aumento = sc.nextDouble();

        if (aumento > 1.0) {
            aumento /= 100;
        }

        salario = (aumento * salario) + salario;

        aumento = aumento * 100;

        System.out.printf("Percentual do Aumento: %.0f%%\n", aumento);
        System.out.printf("Novo Salario: R$%.2f", salario);

        sc.close();
    }
}
