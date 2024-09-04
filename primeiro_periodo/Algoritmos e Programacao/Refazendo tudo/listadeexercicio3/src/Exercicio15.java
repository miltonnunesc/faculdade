import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quant_maca = sc.nextInt();

        if (quant_maca < 12) {
            double valor_maca = 1.30;
            double valor_compra = quant_maca * valor_maca;

            System.out.printf("Valor da Compra: R$%.2f", valor_compra);
        } else {
            double valor_maca = 1.0;
            double valor_compra = quant_maca * valor_maca;
            System.out.printf("Valor da Compra: R$%.2f", valor_compra);
        }
        
        sc.close();
    }
}
