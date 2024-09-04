import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double salario, gratificacao = 0.05, imposto = 0.07;
        
        salario = sc.nextDouble();

        gratificacao = gratificacao * salario;
        imposto = (salario + gratificacao) * imposto;

        salario = (salario + gratificacao) - imposto;

        System.out.printf("Gratificacao: R$%.2f\n", gratificacao);
        System.out.printf("Imposto: R$%.2f\n", imposto);
        System.out.printf("Salario final: R$%.2f", salario);
        
        sc.close();
    }
}
