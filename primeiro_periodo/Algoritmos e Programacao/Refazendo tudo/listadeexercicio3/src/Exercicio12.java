import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double porc_distribuidor = 0.28;
        double porc_imposto = 0.45;

        System.out.println("Informe o custo de fabrica: ");
        double custo_fabrica = sc.nextDouble();

        double custo_final = (custo_fabrica * porc_distribuidor) + (custo_fabrica * porc_imposto) + custo_fabrica;

        System.out.printf("Custo final: R$%.2f", custo_final);

        sc.close();
    }
}