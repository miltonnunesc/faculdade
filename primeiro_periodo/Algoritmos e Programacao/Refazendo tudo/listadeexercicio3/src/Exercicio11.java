import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o salario: ");
        double salario = sc.nextDouble();

        System.out.println("Informe o percentual de reajuste: ");
        double reajuste = sc.nextDouble();

        if(reajuste > 1) {
            reajuste = reajuste / 100;
        }
        
        double salario_reajustado = (salario * reajuste) + salario;

        System.out.printf("Novo salario: R$%.2f", salario_reajustado);
 
        sc.close();
    }
}