import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario, aumento = 0.25;

        salario = sc.nextDouble();
        salario = (salario * aumento) + salario;

        System.out.println("Novo Salário: R$" + salario);

        sc.close();
    }
}
